//import java.util.Locale;

public class saidaDados {
    public static void main(String[] args) throws Exception {
        System.out.println("ola"); // tem quebra de linha
        System.out.print("ola"); // n tem quebra de linha
        System.out.println("ola"); // tem quebra de linha

        int y = 32;
        System.out.println(y);
        // Locale.setDefault(Locale.US);

        double x = 10.12345;
        System.out.println(x);
        System.out.printf("%.2f%n", x); // %.2f é a formatação para duas casas decimais e o %n é a quebra de linha em
                                        // java

        String nome = "MAria";
        int idade = 25;
        double renda = 4000.0;

        System.out.printf("%s tem %d anos e ganha %.2f de reais%n", nome, idade, renda);

        // casting/ conversão explicita dos valores

        double resultado;
        int a = 5, b = 2;

        resultado = a / b;
        System.out.println(resultado);

        resultado = (double) a / b; // casting
        System.out.println(resultado);

    }
}
