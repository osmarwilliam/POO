package application;

import entities.Aluno;

public class main {

    public static void main(String[] args) {
        Aluno a1 = new Aluno(10, 8, 4, 2);
        Aluno a2 = new Aluno(4, 4, 5, 8);
        float nota = (float) a1.mediaAluno();
        System.out.println(nota);
        nota = (float) a2.mediaAluno();
        a1.statusAluno();

        System.out.println(nota);
        a2.statusAluno();
    }
}
