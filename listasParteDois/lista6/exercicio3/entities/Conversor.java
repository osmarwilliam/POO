package entities;

public class Conversor {

    private int segundos;
    private int minutos;
    private int horas;

    public Conversor(int segundos) {
        this.segundos = segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    // 60 segundos = 1 minuto;
    //
    public int getMinutos() {
        this.minutos = (getSegundos() - getHoras() * 3600) / 60;
        return this.minutos;
    }

    public int getHoras() {
        this.horas = getSegundos() / 3600;
        return this.horas;
    }

    public int getSegundos() {
        return this.segundos;
    }

    public int getSegundosAfterCalculo() {
        return (getSegundos() - (getMinutos() * 60 + getHoras() * 3600));
    }

    public void imprimir() {
        System.out.println(
            getSegundos() +
                " segundos equivale: " +
                getHoras() +
                " horas, " +
                getMinutos() +
                " minutos, " +
                getSegundosAfterCalculo() +
                " segundos."
        );
    }
}
