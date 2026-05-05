import java.util.Scanner;

public class ex1 {

    public static void main(String[] agrv) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite o número de alunos: ");
        int n = sc.nextInt();

        Float[] notaAlunos = new Float[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite a nota do aluno %d: ", i + 1);
            notaAlunos[i] = sc.nextFloat();
        }

        Float soma = 0f;
        for (Float nota : notaAlunos) {
            soma += nota;
        }

        Float media = soma / n;

        System.out.println("A média é: " + media);

        sc.close();
    }
}
