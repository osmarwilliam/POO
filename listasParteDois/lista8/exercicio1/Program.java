import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;
        int soma = 0;

        while (true) {
            try {
                System.out.printf("Digite um número: ");
                num = sc.nextInt();

                if (num <= 0) {
                    break;
                }
                soma += num;
                System.out.println("Somatório: " + soma);
            } catch (Exception e) {
                sc.nextLine();
                System.out.printf("Digite um número válido%n");
            }
        }

        sc.close();
    }
}
