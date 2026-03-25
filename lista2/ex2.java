import java.util.Scanner;
import java.util.Locale;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a,b;
        Locale.setDefault(Locale.US);
        System.out.printf("Digite o valor de a: ");
        a = sc.nextFloat();

        System.out.printf("Digite o valor de b: ");
        b = sc.nextFloat();

        System.out.printf("soma: %.2f%nSubtração: %.2f%nMulti: %.2f%nDivisao: %.2f%n", a+b, a -b, a*b, a/b);
        
        sc.close();
    }    

}
