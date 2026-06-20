package application;

import entities.Data;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Data d1 = new Data(31, 02, 2024);
        Data d2 = new Data(31, 15, 2026);
        Data d3 = new Data(12, 06, 2024);
        testarData(d1);
        System.out.println();
        testarData(d2);
        System.out.println();
        testarData(d3);
        sc.close();
    }

    public static void testarData(Data d1) {
        if (d1.dataValida()) {
            System.out.println("Data valida");
        } else {
            System.out.println("Data n valida");
        }
        if (d1.anoBissexto()) {
            System.out.println("ano bissexto");
        } else {
            System.out.println("ano n bissextow");
        }
        d1.imprimir("-");
    }
}
