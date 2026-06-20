package entities;

import entities.Funcionario;

public class Gerente extends Funcionario {

    public Gerente() {}

    public Gerente(String nome, int senha) {
        super(nome, senha);
    }

    // metodo para fechar o caixa
    public void fecharCaixa() {}
}
