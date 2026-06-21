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
            throw new ArithmeticException("Não é possível dividir por zero");
        }
    }

    public void raizQuadrada() {
        if (this.memoria >= 0) {
            this.memoria = Math.sqrt(this.memoria);
        } else {
            throw new ArithmeticException(
                "Nao existe raiz quadrada de número negativo"
            );
        }
    }

    public void limparMemoria() {
        this.memoria = 0;
    }
}
