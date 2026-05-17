package application;

import entities.Retangulo;
import java.util.Locale;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Retangulo rect = new Retangulo();
        System.out.println("DIgite o valor da altura e do comprimento: ");
        rect.width = sc.nextDouble();
        rect.height = sc.nextDouble();

        System.out.println("Area = " + rect.area());
        System.out.println("Perimeter = " + rect.perimeter());
        System.out.println("Diagonal = " + rect.diagonal());

        sc.close();
    }
}
