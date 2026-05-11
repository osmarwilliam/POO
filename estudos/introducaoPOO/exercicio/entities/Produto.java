package entities;

public class Produto {

    public double preco;
    public String nome;
    public int qtdEstoque;

    public void TotalValueInStock() {
        if (qtdEstoque == 0) {
            System.out.printf("%nNão há estoque dessa produto!%n");
        } else {
            double total = qtdEstoque * preco;
            System.out.printf(
                "O valor total desse produto no estoque é de: %.2f reais %n",
                total
            );
        }
    }

    public void AddProduts(int qtdAdiciona) {
        this.qtdEstoque = qtdAdiciona + this.qtdEstoque;
        System.out.printf("Estoque adicionado com sucesso%n");
    }

    public void RemoveProducts(int qtdRemove) {
        if (qtdEstoque <= 0) {
            System.out.printf("Não há estoque para ser removido%n");
        } else if (qtdRemove > this.qtdEstoque) {
            System.out.printf(
                "Não há essa quantidade de produtos no estoque para ser removido%n"
            );
        } else {
            this.qtdEstoque = this.qtdEstoque - qtdRemove;
            System.out.printf("Estoque alterado com sucesso%n");
        }
    }
}
