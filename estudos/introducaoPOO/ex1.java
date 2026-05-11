import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int higher = max(a, b, c);
        showResult(higher);

        sc.close();
    }

    public static void showResult(int x) {
        System.out.printf("O maior valor é %d%n", x);
    }

    public static int max(int a, int b, int c) {
        int maior;
        if (a > b && a > c) {
            maior = a;
        } else if (b > c) {
            maior = b;
        } else {
            maior = c;
        }
        return maior;
    }
}
