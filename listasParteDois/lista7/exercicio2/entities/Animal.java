package entities;

public abstract class Animal {

    private String nome;

    public Animal() {}

    public Animal(String nome) {
        this.nome = nome;
    }

    public abstract void fala();

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
