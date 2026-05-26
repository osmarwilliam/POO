/*
Utilizando os conceitos de classes e métodos: Faça um método que calcule a
média de um aluno de acordo com os critérios da disciplina: Trabalho 1, P1,
Trabalho 2, P2. Além disso, faça um outro método que informe o status do
aluno de acordo com as regras seguir:
● Nota acima de 6 à “Aprovado”
● Nota entre 4 e 6 à Conceito “Verificação Suplementar”
● Nota abaixo de 4 à Conceito “Reprovado”
*/

package entities;

public class Aluno {

    private float t1;
    private float t2;
    private float p1;
    private float p2;

    public Aluno(float p1, float p2, float t1, float t2) {
        this.p1 = (float) p1;
        this.p2 = (float) p2;
        this.t1 = (float) t1;
        this.t2 = (float) t2;
    }

    public float mediaAluno() {
        return (float) (0.4 * (p1 + p2) + 0.1 * (t1 + t2));
    }

    public void statusAluno() {
        float nota = (float) mediaAluno();

        if (nota < 4) {
            System.out.println("reprovado");
        } else if (nota < 6) {
            System.out.println("Verificação Suplementar");
        } else {
            System.out.println("Aprovado");
        }
    }
}
