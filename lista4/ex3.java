import java.util.Scanner;

public class ex3 {

    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite o tamanho do vetor: ");
        int n = sc.nextInt();
        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite o número da posição %d: ", i + 1);
            vetor[i] = sc.nextInt();
        }

        System.out.printf("Digite o número que será inserido: ");
        int k = sc.nextInt();

        System.out.printf("Digite a posição que o número será inserido: ");
        int p = sc.nextInt();
        while (p > n - 1 || p < 0) {
            System.out.println("%nPosição inválida!!");
            System.out.printf("Digite uma posição válida: ");
            p = sc.nextInt();
        }
        reOrdenar(vetor, k, p, n);
        sc.close();
    }

    public static void reOrdenar(int[] vetor, int k, int p, int tam) {
        System.out.printf("Vetor antes: ");
        imprimir(vetor);
        int tmp = -1;

        tmp = vetor[p];
        vetor[p] = k;

        for (int i = p + 1; i < tam; i++) {
            int tmp2 = vetor[i];
            vetor[i] = tmp;
            tmp = tmp2;
        }
        System.out.print("Vetor Depois: ");

        imprimir(vetor);
    }

    public static void imprimir(int[] vetor) {
        for (int x : vetor) {
            System.out.printf("%d ", x);
        }
        System.out.println("");
    }
}
