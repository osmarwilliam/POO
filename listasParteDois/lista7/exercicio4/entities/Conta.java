package entities;

public abstract class Conta {

    protected int num;
    protected Double saldo;

    public Conta(int num, double Saldo) {
        this.num = num;
        this.saldo = Saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            System.out.printf("saldo insuficiente%n");
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.printf("digite um valor válido para depositar%n");
        }
    }
}
