import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Digite o número: ");
        int num = sc.nextInt();

        String status = (num % 2 == 0) ? "O número é par" : "O número é impar";

        System.err.println(status);

        sc.close();
    }
    
}
