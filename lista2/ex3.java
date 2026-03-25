import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j;
        j = sc.nextInt();
        System.out.printf("hora:%d%nMinuto:%d%nSegundo: %d%n",  j / 3600, (j % 3600) / 60, ((j % 3600) % 60));
        sc.close();
    }
    
}