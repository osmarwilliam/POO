package application;

import entities.Conversor;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite a quantidade de segundos: ");
        Conversor s = new Conversor(sc.nextInt());
        s.imprimir();
        sc.close();
    }
}
