import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String frase = sc.nextLine();

        // remover espacos em branco no início e fim
        frase = frase.trim();

        if (frase.isEmpty()) {
            System.out.println(
                "Nenhuma palavra inserida. Número de palavras não repetidas: 0"
            );
        } else {
            // dividir a frase em palavras e converter para minusculas
            String[] palavrasArray = frase.toLowerCase().split("\\s+");

            // um set nao permite elementos iguais
            Set<String> palavrasSet = new HashSet<>(
                Arrays.asList(palavrasArray) // fica mais fácil ja cria adicionando
            );

            System.out.println(
                "Número de palavras não repetidas na frase: " +
                    palavrasSet.size()
            );
            System.out.println("Palavras únicas encontradas: " + palavrasSet);
        }

        sc.close();
    }
}
