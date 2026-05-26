package application;

import entities.Calculadora;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calculadora calcula = new Calculadora();
        int opcao = 0;
        while (opcao != 6) {
            menu(calcula);
            opcao = sc.nextInt();
            if (opcao >= 1 && opcao <= 4) {
                System.out.print("Digite o valor para a operação: ");
                double valor = sc.nextDouble();
                if (opcao == 1) {
                    calcula.somar(valor);
                } else if (opcao == 2) {
                    calcula.subtrair(valor);
                } else if (opcao == 3) {
                    calcula.multiplicar(valor);
                } else if (opcao == 4) {
                    calcula.dividir(valor);
                }
            } else if (opcao == 5) {
                calcula.limparMemoria();
                System.out.println("Memoria limpa com sucesso!");
            } else if (opcao == 6) {
                System.out.println("Encerrando a calculadora!!");
            } else {
                System.out.println("Opção inválida! Tente novamente");
            }
        }

        sc.close();
    }

    public static void menu(Calculadora calcula) {
        System.out.println("\nEstado da memória: " + calcula.getMemoria());
        System.out.println("Opções:");
        System.out.println("(1) Somar");
        System.out.println("(2) Subtrair");
        System.out.println("(3) Multiplicar");
        System.out.println("(4) Dividir");
        System.out.println("(5) Limpar memória");
        System.out.println("(6) Sair do programa");
        System.out.print("Qual opção você deseja? ");
    }
}
