package entities;

import entities.Usuario;

public class Cliente extends Usuario {

    // qualquer dado a mais seja endereço, número etc
    private integer numero;

    public Cliente() {}

    public Cliente(String nome, int senha, integer numero) {
        super(nome, senha);
        this.numero = numero;
    }

    // e aqui ficaria os getters e setters
}
