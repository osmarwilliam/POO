import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;

        System.out.printf("Digite seu nome: ");
        nome = teclado.nextLine();

        System.out.printf("Olá, %s! Bem-vindo ao java!%n", nome);
        teclado.close();
    }
    
}