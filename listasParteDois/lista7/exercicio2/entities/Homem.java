package entities;

import entities.Animal;

//oi

public class Homem extends Animal {

    public Homem() {}

    public Homem(String nome) {
        super(nome);
    }

    @Override
    public void fala() {
        System.out.printf("oi%n");
    }
}
