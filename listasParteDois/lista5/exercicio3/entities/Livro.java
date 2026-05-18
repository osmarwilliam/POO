package entities;

public class Livro {

    // aqui poderia ter várias e várias coisas sobre o nome, como ano de lançamento/edição/editora e etc
    private String nomeLivro;
    private String autor;
    private boolean disponibilidade;

    public Livro(String nomeLivro, String autor) {
        this.nomeLivro = nomeLivro;
        this.autor = autor;
        this.disponibilidade = true;
    }

    public boolean getDisponibilidadeLivro() {
        return this.disponibilidade;
    }

    public boolean setDisponibilidadeLivro(Boolean valor) {
        return this.disponibilidade = valor;
    }

    public String getNomeLivro() {
        return this.nomeLivro;
    }

    public String getNomeAutor() {
        return this.autor;
    }
}
