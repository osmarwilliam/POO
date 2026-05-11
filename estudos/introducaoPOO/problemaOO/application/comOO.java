package application;

import entities.Triangle;
import java.util.Locale;
import java.util.Scanner;

public class comOO {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.printf("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.printf("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double p = (x.a + x.b + x.c) / 2.0;
        double areaX = x.area();

        p = (y.a + y.b + y.c) / 2.0;
        double areaY = y.area();

        System.out.printf("Triangle X area : %.4f%n", areaX);
        System.out.printf("Triangle Y area : %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.printf("Larger area = %.4f%n", areaX);
        } else {
            System.out.printf("Larger area = %.4f%n", areaY);
        }

        sc.close();
    }
}
