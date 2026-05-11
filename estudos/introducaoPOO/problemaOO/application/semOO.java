package problemaOO;

/*
    a ideia é resolver um problema sem OO e depois resolver o mesmo problema
    utilizando OO para entender a necessidade
*/

package problemaOO.application;
import java.util.Locale;
import java.util.Scanner;


public class semOO {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Triangle x, y;

        System.out.printf("Enter the measures of triangle X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.printf("Enter the measures of triangle Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        System.out.printf("Triangle X area : %.4f%n", areaX);
        System.out.printf("Triangle X area : %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.printf("Larger area = %.4f%n", areaX);
        } else {
            System.out.printf("Larger area = %.4f%n", areaY);
        }
        sc.close();
    }
}
