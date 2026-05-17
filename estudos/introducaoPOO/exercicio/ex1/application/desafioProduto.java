package application;

//public package exercicio;

import entities.Produto;
import java.util.Locale;
import java.util.Scanner;

class desafioProduto {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Produto produto1 = new Produto();
        System.out.printf("Digite o nome do produto: ");
        produto1.nome = sc.nextLine();
        System.out.printf("Digite o preço do produto: ");
        produto1.preco = sc.nextFloat();

        int control = 0;
        while (control != 1) {
            menu();
            control = sc.nextInt();
            if (control == 2) {
                produto1.TotalValueInStock();
            } else if (control == 3) {
                int qtdAdicionar = 0;
                System.out.printf("Digite o valor para adicionar: ");
                qtdAdicionar = sc.nextInt();
                produto1.AddProduts(qtdAdicionar);
            } else if (control == 4) {
                int qtdRemover = 0;
                System.out.printf("Digite o valor para Remover: ");
                qtdRemover = sc.nextInt();
                produto1.RemoveProducts(qtdRemover);
            }
        }

        sc.close();
    }

    public static void menu() {
        System.out.println("\nDigite 1 caso queira sair ");
        System.out.println(
            "Digite 2 caso queira mostrar o valor total no estoque"
        );
        System.out.println("Digite 3 caso queira adicionar mais do produto");
        System.out.println("Digite 4 caso queira remover o produto");
    }
}
