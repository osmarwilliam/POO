package application;

import entities.Estagiario;
import entities.Vendedores;

public class Program {

    public static void main(String[] args) {
        Estagiario e1 = new Estagiario("adao", 2000);
        Vendedores v1 = new Vendedores("Rogerinho do ingá", 4800, 200);

        System.out.println(
            "estagiario IR: " +
                e1.calculoIR() +
                ", salario: " +
                e1.salarioLiquido()
        );

        System.out.println(
            "vendedor IR: " +
                v1.calculoIR() +
                ", salario: " +
                v1.salarioLiquido()
        );
    }
}
