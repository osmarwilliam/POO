package application;

import entities.Emprestimo;
import entities.Livro;
import entities.Pessoa;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa p1 = new Pessoa("Joao", 22919191);
        Livro l1 = new Livro("on the road", "jack kerouac");
        Livro l2 = new Livro("harry potter", "J.K. Rowling");
        Livro l3 = new Livro("brasil uma historia", "eduardo bueno");

        Emprestimo biblioteca = new Emprestimo();
        biblioteca.setAdicionarLivro(l1);
        biblioteca.setAdicionarLivro(l2);
        biblioteca.setAdicionarLivro(l3);
        biblioteca.exibirBiblioteca();

        biblioteca.emprestarLivro("on the road", p1);
        biblioteca.exibirBiblioteca();

        biblioteca.devolverLivro("on the road", p1);
        biblioteca.exibirBiblioteca();

        sc.close();
    }
}
