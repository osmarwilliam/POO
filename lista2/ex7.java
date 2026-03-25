import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, maior, menor;
        
        n = sc.nextInt();
        menor = sc.nextInt();
        maior= sc.nextInt();

        dento(n, menor, maior);

        sc.close();
    }



    public static boolean dento(int n, int menor, int maior){
        if(n < menor){
            System.out.println("Antes");
            return false;
        } else if(n > maior){
            System.out.println("Depois");
            return false;
        } else {
            System.out.println("No meio");
            return true;
        }


    }
}
