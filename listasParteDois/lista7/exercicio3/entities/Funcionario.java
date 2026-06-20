package entities;

public abstract class Funcionario {

    private String nome;
    protected float salarioBruto;

    public Funcionario(String nome, float salario) {
        this.nome = nome;
        this.salarioBruto = salario;
    }

    public abstract float calculoIR();

    public abstract float salarioLiquido();

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return this.salarioBruto;
    }

    public void setSalario(float n) {
        this.salarioBruto = n;
    }
}
