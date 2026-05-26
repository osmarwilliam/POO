package application;

import entities.Circulo;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y;
        double raio;
        System.out.printf("DIgite o valor de x: ");
        x = sc.nextInt();
        System.out.printf("DIgite o valor de y: ");
        y = sc.nextInt();
        System.out.printf("DIgite o valor do raio: ");
        raio = sc.nextDouble();

        Circulo c = new Circulo(x, y, raio);

        sc.close();
    }
}
