package entities;

public class Estagiario extends Funcionario {

    public Estagiario(String nome, float salario) {
        super(nome, salario);
    }

    @Override
    public float calculoIR() {
        return 0.0f;
    }

    @Override
    public float salarioLiquido() {
        return (this.salarioBruto - this.calculoIR());
    }
}
