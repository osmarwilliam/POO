import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite a palavra: ");
        String palavra = sc.nextLine();

        System.out.printf(
            "Quantidade de caracteres: %d%n",
            palavra.replaceAll("\\s+", "").length()
        );
        System.out.printf("%s%n", palavra.toUpperCase());
        System.out.printf("%s%n", palavra.toLowerCase());

        int count = 0;
        for (char c : palavra.toCharArray()) {
            if (c == 'a') {
                count++;
            }
        }
        System.out.printf("A letra a aparece %d vezes%n", count);

        sc.close();
    }
}
