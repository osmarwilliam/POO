package entities;

public class Circulo {

    private int x;
    private int y;
    private double raio;

    public Circulo(int x, int y, double raio) {
        this.x = x;
        this.y = y;
        this.raio = raio;
    }

    public void mover(int novoX, int novoY) {
        this.x = novoX;
        this.y = novoY;
    }

    public void desenhar() {
        System.out.printf("Circulo: (%d %d %f)", this.x, this.y, this.raio);
    }

    public void redimensionar(double raiox) {
        if (raiox > 0) {
            this.raio = (double) raiox;
        }
    }

    // metodos de acesso (getters e setters)

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return this.raio;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}
