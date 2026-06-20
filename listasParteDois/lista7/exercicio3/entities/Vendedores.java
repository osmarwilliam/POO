package entities;

import entities.Funcionario;

public class Vendedores extends Funcionario {

    // to deduzindo q bonus seja um valor inteiro como 200 reais e nao um %
    private float bonus;

    public Vendedores(String nome, float salario, float bonus) {
        super(nome, salario);
        this.bonus = bonus;
    }

    @Override
    public float calculoIR() {
        if (this.salarioBruto + bonus <= 900.0f) {
            return 0.0f;
        } else if (this.salarioBruto + bonus <= 1500.0f) {
            return (this.salarioBruto + bonus) * 0.15f;
        } else {
            return (this.salarioBruto + bonus) * 0.2f;
        }
    }

    @Override
    public float salarioLiquido() {
        return (this.salarioBruto + this.bonus - this.calculoIR());
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float b) {
        this.bonus = b;
    }
}
