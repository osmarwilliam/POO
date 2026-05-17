package entities;

public class ItemPedido {

    private Produto produto;
    private int qtd;

    public ItemPedido(Produto produto, int qtdProduto) {
        if (qtdProduto < 0) {
            throw new IllegalArgumentException(
                "Digite um valor válido para a quantidade!"
            );
        }

        if (qtdProduto > produto.getEstoque()) {
            throw new IllegalArgumentException(
                "Estoque insuficiente de " +
                    produto.getNome() +
                    ", Disponível: " +
                    produto.getEstoque()
            );
        }

        if (produto == null) {
            throw new IllegalArgumentException("O produto não pode ser nulo");
        }
        // precisaria verificar se o produto ta no estoque tbm para criar o pedido do cliente
        this.produto = produto;
        this.qtd = qtdProduto;
    }

    public int getQtd() {
        return qtd;
    }

    public Produto getProduto() {
        return produto;
    }

    // pra ficar mais fácil quando vc calcular o valor total do pedido
    public double calcularSubtotal() {
        return qtd * produto.getPrice();
    }
}
