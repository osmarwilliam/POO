import java.util.Scanner;

class Pessoa {

    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}

public class ex4 {

    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Vai adicionar quantas pessoas: ");
        int n = sc.nextInt();

        // criei um array com uma classe de Pessoas, cada pessoa tem o nome e idade
        Pessoa[] vetorPessoas = new Pessoa[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.printf("Digite o nome da %dª pessoa: ", i + 1);
            String nome = sc.nextLine();
            System.out.printf("Digite a idade da %dª pessoa: ", i + 1);
            int idade = sc.nextInt();

            vetorPessoas[i] = new Pessoa(nome, idade);
        }

        // implementando selection sort para ordenar
        Pessoa primeiro = null;
        int posMaior = 0;
        for (int i = 0; i < n; i++) {
            posMaior = i;
            primeiro = vetorPessoas[i];
            for (int j = i + 1; j < n; j++) {
                if (primeiro.nome.compareTo(vetorPessoas[j].nome) > 0) {
                    primeiro = vetorPessoas[j];
                    posMaior = j;
                }
            }

            if (primeiro.nome.compareTo(vetorPessoas[i].nome) == 0) {
                if (primeiro.idade > vetorPessoas[i].idade) {
                    Pessoa tmp = vetorPessoas[i];
                    vetorPessoas[i] = primeiro;
                    primeiro = tmp;
                }
            }
            Pessoa tmp = null;
            tmp = vetorPessoas[i];
            vetorPessoas[i] = primeiro;
            vetorPessoas[posMaior] = tmp;
        }

        System.out.println("\n--- Lista de Pessoas Ordenadas ---");
        for (int i = 0; i < n; i++) {
            System.out.printf(
                "Nome: %s, Idade: %d\n",
                vetorPessoas[i].nome,
                vetorPessoas[i].idade
            );
        }

        sc.close();
    }
}
