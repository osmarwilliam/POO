package application;

import entities.ContaCorrente;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaCorrente conta = new ContaCorrente(25000);

        conta.exibirSaldo();
        conta.sacar(13540);
        conta.exibirSaldo();
        conta.depositar(3500);
        conta.exibirSaldo();

        conta.depositar(-1000);
        conta.exibirSaldo();

        conta.sacar(50000);
        conta.exibirSaldo();

        sc.close();
    }
}
