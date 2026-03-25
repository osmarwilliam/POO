import java.util.Scanner;

class velocidadeMedia{
    double media;
    double consumo;

    public velocidadeMedia(double media, double consumo){
        this.media = media;
        this.consumo = consumo;
    }

    public static velocidadeMedia calcular(double a, double b, double c) {
        return new velocidadeMedia(a/ b, a/c);
}

}

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double dis, tempo, combu;
        dis = sc.nextFloat();
        tempo = sc.nextFloat();
        combu = sc.nextFloat();
        velocidadeMedia resultado = velocidadeMedia.calcular(dis, tempo, combu);
        System.out.println(resultado.media);
        System.out.println(resultado.consumo);
    }
}


