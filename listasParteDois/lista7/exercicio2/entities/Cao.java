package entities;

import entities.Animal;

public class Cao extends Animal {

    public Cao() {}

    public Cao(String nome) {
        super(nome);
    }

    @Override
    public void fala() {
        System.out.printf("Au au%n");
    }
}
