import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;

        System.out.printf("Digite o valor de a: ");
        a = sc.nextInt();

        System.out.printf("Digite o valor de b: ");
        b = sc.nextInt();

        System.out.printf("soma: %d%nSubtração: %d%nMulti: %d%nDivisao: %d%n", a+b, a -b, a*b, a/b);
        
        sc.close();
    }    

}
