package application;

import entities.Animal;
import entities.Cao;
import entities.Gato;
import entities.Homem;
import java.util.Random;

public class Program {

    public static void main(String[] args) {
        Animal[] animais = new Animal[10];

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(3 - 1 + 1) + 1;
            if (num == 1) {
                animais[i] = new Cao();
            } else if (num == 2) {
                animais[i] = new Gato();
            } else {
                animais[i] = new Homem();
            }
        }

        for (int i = 0; i < 10; i++) {
            animais[i].fala();
        }
    }
}
