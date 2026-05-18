package entities;

import entities.Livro;
import java.util.ArrayList;

public class Pessoa {

    private String nome;
    private int numeroCelular;
    private ArrayList<Livro> livrosEmprestados = new ArrayList<>();

    public Pessoa(String nome, int numero) {
        this.nome = nome;
        this.numeroCelular = numero;
    }

    public ArrayList<Livro> getItens() {
        return this.livrosEmprestados;
    }

    public void setLivroPegados(Livro l) {
        livrosEmprestados.add(l);
    }

    public void devolverLivroUser(Livro l) {
        if (livrosEmprestados.remove(l)) {
            System.out.println("Livro devolvido com sucesso");
        } else {
            System.out.println("Livro foi possível devolver");
        }
    }
}
