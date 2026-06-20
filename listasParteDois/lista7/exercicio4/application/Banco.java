package application;

import entities.ContaComum;
import entities.ContaEspecial;
import entities.ContaPoupanca;

public class Banco {

    public static void main(String[] args) {
        ContaComum cc = new ContaComum(1, 20000);

        ContaEspecial ce = new ContaEspecial(2, 30000, 10000);
        ContaPoupanca cp = new ContaPoupanca(3, 20000, 10);

        cc.depositar(10000);
        cc.sacar(20000);
        System.out.println(cc.getSaldo());

        ce.depositar(10000);
        ce.sacar(45000);
        System.out.println(ce.getSaldo());

        cp.depositar(10000);
        cp.sacar(20000);
        cp.render();
        System.out.println(cp.getSaldo());
    }
}
