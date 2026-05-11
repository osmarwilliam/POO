import java.util.Scanner;

public class ex6 {

    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite o nome : ");
        String nome = sc.nextLine();

        System.out.printf("Digite o preço : ");
        double preco = sc.nextFloat();

        System.out.printf("Digite a quantidade : ");
        int qtd = sc.nextInt();

        double valorTotal = qtd * preco;
        calculo(qtd, valorTotal, nome);
        sc.close();
    }

    public static void calculo(int qtd, double valorTotal, String nome) {
        if (qtd <= 10) {
            System.out.printf("Produto:%s%nValor: %f%n", nome, valorTotal);
        } else if (qtd <= 20) {
            System.out.printf(
                "Produto:%s%nValor: %f%n",
                nome,
                valorTotal * 0.9
            );
        } else if (qtd <= 50) {
            System.out.printf(
                "Produto:%s%nValor: %f%n",
                nome,
                valorTotal * 0.8
            );
        } else {
            System.out.printf(
                "Produto:%s%nValor: %f%n",
                nome,
                valorTotal * 0.75
            );
        }
    }
}
