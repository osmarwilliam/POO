package entities;

import entities.Animal;

//miau
public class Gato extends Animal {

    public Gato() {}

    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void fala() {
        System.out.printf("Miau%n");
    }
}
