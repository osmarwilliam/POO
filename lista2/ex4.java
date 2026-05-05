import java.util.Scanner;

class velocidadeMedia {

    double media;
    double consumo;

    public velocidadeMedia(double media, double consumo) {
        this.media = media;
        this.consumo = consumo;
    }

    public static velocidadeMedia calcular(double a, double b, double c) {
        return new velocidadeMedia(a / b, a / c);
    }
}

public class ex4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double dis, tempo, combu;
        System.out.printf("Digite a distancia em km: ");
        dis = sc.nextFloat();
        System.out.printf("Digite a tempo em horas: ");
        tempo = sc.nextFloat();
        System.out.printf("Digite a qtd de combustível gasto: ");
        combu = sc.nextFloat();
        velocidadeMedia resultado = velocidadeMedia.calcular(dis, tempo, combu);
        System.out.println("Velocidade média: " + resultado.media);
        System.out.println("Consumo médio: " + resultado.consumo);
        sc.close();
    }
}
