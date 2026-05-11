import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l1, l2, l3;
        l1 = sc.nextInt();
        l2 = sc.nextInt();
        l3 = sc.nextInt();
        if ((l1 == l2) && l2 == l3) {
            System.out.println("É equilátero");
        } else if (l1 == l2 || l1 == l3 || l2 == l3) {
            System.out.println("É isósceles");
        } else {
            System.out.println("É escaleno");
        }
        sc.close();
    }
}
