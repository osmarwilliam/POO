package entities;

public class Produto {

    private int qtdestoque;
    private double price;
    private String nome;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.price = preco;
        this.qtdestoque = quantidadeEstoque;
    }

    public void reduzirEstoque(int qtd) {
        this.qtdestoque -= qtd;
    }

    public int getEstoque() {
        return qtdestoque;
    }

    public double getPrice() {
        return price;
    }

    public String getNome() {
        return nome;
    }

    // colocar método para reduzir estoque na hr da venda
}
