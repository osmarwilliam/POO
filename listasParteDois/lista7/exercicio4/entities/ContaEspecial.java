package entities;

public class ContaEspecial extends Conta {

    private double limite;

    public ContaEspecial(int num, double Saldo, double limite) {
        super(num, Saldo);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= this.saldo + this.limite) {
            this.saldo -= valor;
        } else {
            System.out.printf("saldo insuficiente%n");
        }
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.printf("digite um valor válido para depositar%n");
        }
    }

    // get e set
}
