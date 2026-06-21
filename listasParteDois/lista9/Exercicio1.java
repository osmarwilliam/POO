import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite uma frase: ");
        String frase = sc.nextLine();

        // dividir a frase em palavras, usar apenas " " iria criar espaços vazios dentro do array
        String[] palavrasArray = frase.split("\\s+");

        // colocar as palavras em uma lista
        List<String> palavrasList = new ArrayList<>(
            Arrays.asList(palavrasArray)
        );

        Collections.reverse(palavrasList);

        // montar a frase invertida
        String fraseInvertida = String.join(" ", palavrasList);

        System.out.println("Frase invertida: ");
        System.out.println(fraseInvertida);

        sc.close();
    }
}
