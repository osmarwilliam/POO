/*
SOLUÇÃO DO EXERCÍCIO 2:
2 - A) a solução correta é a primeira
2 - B) para a segunda solução ser correta poderiamos trocar para um while no lugar do DO WHILE, ou, uma outra
possiblidade seria receber o valor do código antes de entrar no DO WHILE e fazer sua verificação antes do mesmo,
como no exemplo do código a seguir:

    System.out.printf("Informe o codigo: ");
    codigo = teclado.nextInt();
    if(codigo != -1){
        do {
            System.out.println("Código: " + codigo);
            System.out.printf("Informe o código: ");
            codigo = teclado.nextInt();
        } while (codigo != -1);
    }

Desta forma o código com DO WHILE funcionária normal

*/
/*
--- Primeiro Código --

import java.util.Scanner;
public class ex2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int codigo;

        System.out.printf("Informe o codigo: ");
s        codigo = teclado.nextInt();

        while (codigo != -1) {
            System.out.println("Código: " + codigo);
            System.out.printf("Informe o código: ");
            codigo = teclado.nextInt();
        }
        teclado.close();
    }
}
*/
/*
--- Segundo código ---

import java.util.Scanner;
public class ex2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int codigo;

        System.out.printf("Informe o codigo: ");
        codigo = teclado.nextInt();

        do {
            System.out.println("Código: " + codigo);
            System.out.printf("Informe o código: ");
            codigo = teclado.nextInt();
        } while (codigo != -1);
        teclado.close();
    }
}

*/
