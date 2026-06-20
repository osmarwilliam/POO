package entities;

public class ContaPoupanca extends Conta {

    private double percentualRendimento;

    public ContaPoupanca(int num, double Saldo, double p) {
        super(num, Saldo);
        this.percentualRendimento = p;
    }

    public void render() {
        this.saldo =
            this.saldo + (this.saldo * this.percentualRendimento) / 100f;
    }
}
