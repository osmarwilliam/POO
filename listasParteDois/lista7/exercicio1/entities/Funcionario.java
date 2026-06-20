package entities;

import entities.Usuario;

public class Funcionario extends Usuario {

    public Funcionario() {}

    public Funcionario(String nome, int senha) {
        super(nome, senha);
    }

    // metodo para vender
    public void vender() {}
}
