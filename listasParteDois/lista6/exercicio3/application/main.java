package application;

import entities.Conversor;

public class main {

    public static void main(String[] args) {
        Conversor s = new Conversor(3600);
        s.imprimir();
        s.setSegundos(50000);
        s.imprimir();
        s.setSegundos(7200);
        s.imprimir();
        s.setSegundos(3500);
        s.imprimir();
    }
}
