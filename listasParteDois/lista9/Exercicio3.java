import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String frase = sc.nextLine();

        frase = frase.trim();

        if (frase.isEmpty()) {
            System.out.println("Nenhuma palavra inserida.");
        } else {
            String[] palavrasArray = frase.toLowerCase().split("\\s+");

            // map onde a chave é a palavra (string) e o valor é a quantidade de ocorrencias (integer)
            Map<String, Integer> contagemPalavras = new HashMap<>();

            for (String palavra : palavrasArray) {
                // se a palavra já existe no map, adicionamos 1 à contagem atual
                if (contagemPalavras.containsKey(palavra)) {
                    int contagemAtual = contagemPalavras.get(palavra);
                    contagemPalavras.put(palavra, contagemAtual + 1);
                } else {
                    // se for a primeira vez que a palavra aparece, iniciamos com a contagem 1
                    contagemPalavras.put(palavra, 1);
                }
            }

            System.out.println("\nocorrencias de cada palavra:");
            for (Map.Entry<
                String,
                Integer
            > entry : contagemPalavras.entrySet()) {
                System.out.println(
                    "Palavra: '" +
                        entry.getKey() +
                        "' -> ocorrencias: " +
                        entry.getValue()
                );
            }
        }

        sc.close();
    }
}
