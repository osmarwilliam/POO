package entities;

import java.util.ArrayList;

public class Mercado {

    private ArrayList<Produto> listaProdutos = new ArrayList<>();

    // meio que para cadastrar o produto no sistema
    public void setProduto(Produto item) {
        listaProdutos.add(item);
    }

    // caso precise remover algum produto
    public void setRemover(Produto produto) {
        listaProdutos.remove(produto);
    }

    // para imprimir a lista do estoque, aqui poderia ter usado o toString();
    public void getListaProdutos() {
        System.out.println("----Imprimindo itens do mercado----%n");
        for (Produto produto : listaProdutos) {
            System.out.println(
                "Produto: " +
                    produto.getNome() +
                    ", Quantidade em estoque: " +
                    produto.getEstoque()
            );
        }
    }

    // funcao para subtrair o estoque de um item que processado no pedido do cliente
    public void processarPedido(PedidoCliente pedido) {
        for (ItemPedido item : pedido.getItens()) {
            Produto prod = item.getProduto();
            prod.reduzirEstoque(item.getQtd());
        }
        System.out.println("Pedido processado com sucesso!");
    }
}
