import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite o tamanho do vetor: ");
        int n = sc.nextInt();
        int[] vetor = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Digite o número da posição %d: ", i + 1);
            vetor[i] = sc.nextInt();
        }

        System.out.printf("Digite o valor para buscar no vetor: ");

        int comp = sc.nextInt();
        verificar(vetor, comp);
        sc.close();
    }

    public static void verificar(int[] vetor, int numero) {
        int index = 0;
        for (int x : vetor) {
            if (numero == x) {
                System.out.println("Posição: " + index);
                return;
            }
            index++;
        }
        System.out.println("Nao encontrado");
    }
}
