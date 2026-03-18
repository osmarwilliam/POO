import java.util.Locale;
import java.util.Scanner;


public class ex2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float temp;
        float fah;
        System.out.printf("Digite a temperatura em celsius: ");
        temp = sc.nextFloat(); 
        fah = (float) (temp*1.8) +32;
        System.out.printf("%.1fC equivalem a %.1f%n",temp, fah);

        sc.close();
    }
}
