import java.util.Scanner;

public class entradaDados {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String x = teclado.next();
        System.out.println(x);

        int b;
        b = teclado.nextInt();
        System.out.println(b);

        double a;
        a = teclado.nextDouble();
        System.out.println(a);

        char c;
        c = teclado.next().charAt(0);
        System.out.println(c);

        teclado.close();

    }

}
