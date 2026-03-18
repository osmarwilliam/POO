import java.util.Scanner;

public class ex4 {
    public static final int real = 100;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = {100, 50, 25, 10, 5, 1};
        int num;
        System.out.printf("Digite um valor: ");
        num = sc.nextInt();

        int qtdMoedas = 0, j = 0;
        while(j < 6){
            if(num >= vetor[j]){
                num-= vetor[j];
                qtdMoedas+=1;
            } else{
                System.out.printf("A quantidade de %d é %d%n ", vetor[j], qtdMoedas);
                j+=1;
                qtdMoedas = 0;
            }
        }

        sc.close();
    }
        
}
