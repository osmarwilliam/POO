package entities;

public class Calculadora {

    private double memoria;

    public Calculadora() {
        this.memoria = 0.0;
    }

    public double getMemoria() {
        return memoria;
    }

    public void somar(double x) {
        memoria += x;
    }

    public void subtrair(double x) {
        this.memoria -= x;
    }

    public void multiplicar(double x) {
        this.memoria *= x;
    }

    public void dividir(double y) {
        if (y != 0) {
            this.memoria /= y;
        } else {
            System.out.println("n é possível dividir por zero.");
        }
    }

    public void limparMemoria() {
        this.memoria = 0;
    }
}
