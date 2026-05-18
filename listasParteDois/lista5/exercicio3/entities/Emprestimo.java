package entities;

import entities.Livro;
import java.util.ArrayList;

public class Emprestimo {

    // uma lista com todos livros da bibliteca;
    private ArrayList<Livro> bibliotecaVirtual = new ArrayList<>();

    public void setAdicionarLivro(Livro l) {
        bibliotecaVirtual.add(l);
    }

    public ArrayList<Livro> getItensListaLivros() {
        return this.bibliotecaVirtual;
    }

    // retorna 0 caso não encontre o livro no biblioteca
    public int emprestarLivro(String nome, Pessoa pessoa) {
        for (Livro livro : bibliotecaVirtual) {
            if (livro.getNomeLivro().toLowerCase() == nome.toLowerCase()) {
                System.out.println("\nLivro encontrado, verificando status!!");
                if (livro.getDisponibilidadeLivro() == true) {
                    livro.setDisponibilidadeLivro(false);
                    pessoa.setLivroPegados(livro);
                    System.out.println("Livro emprestado com sucesso");
                } else {
                    System.out.println(
                        "Livro já está emprestado para outra pessoa"
                    );
                }
                return 1;
            }
        }
        System.out.println("Livro não encontrado!!");
        return 0;
    }

    public void exibirBiblioteca() {
        for (Livro livro : bibliotecaVirtual) {
            System.out.println(
                "livro : " +
                    livro.getNomeLivro() +
                    ", autor: " +
                    livro.getNomeAutor() +
                    ", disponibilidade: " +
                    livro.getDisponibilidadeLivro()
            );
        }
    }

    public void devolverLivro(String nome, Pessoa pessoa) {
        for (Livro livro : bibliotecaVirtual) {
            if (
                livro.getNomeLivro() == nome &&
                pessoa.getItens().contains(livro)
            ) {
                livro.setDisponibilidadeLivro(true);
                pessoa.devolverLivroUser(livro);
            }
        }
    }
}
