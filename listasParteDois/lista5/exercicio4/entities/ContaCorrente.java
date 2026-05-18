package entities;

public class ContaCorrente {

    private double saldoConta;

    public void exibirSaldo() {
        System.out.println("Saldo da conta = " + this.getSaldo());
    }

    public ContaCorrente(double saldo) {
        this.saldoConta = saldo;
    }

    public double getSaldo() {
        return this.saldoConta;
    }

    public void sacar(double valor) {
        if (valor >= 0) {
            if (valor <= this.saldoConta) {
                this.saldoConta = this.saldoConta - valor;
                System.out.println("Saque realizado com sucesso!");
            } else {
                System.out.println(
                    "Saldo não suficiente, saldo: " + this.getSaldo()
                );
            }
        } else {
            System.out.println("Digite um valor válido para sacar!");
        }
    }

    public void depositar(double valor) {
        if (valor >= 0) {
            this.saldoConta += valor;
        } else {
            System.out.println("Deposite um valor válido!");
        }
    }
}
