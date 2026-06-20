package application;

import entities.Cliente;
import entities.Funcionario;
import entities.Gerente;

public class main {

    public static void main(String[] args) {
        // então pensando na lógica teriamos o seguintes
        /*


                             usuario
                            - nome : string
                            - senha : integer

                            /   \
                           /     \
                          /       \
                         /         \
        Cliente                      Funcionario                                    Gerente
        + qualquer tipo de dado                                   <---------
                                   ----------------------------                 --------------------
                                   + vender(Produto nome) : void                + fecharCaixa() : void

        então tanto o Cliente como o funcionarios vão herdar do usuario os dois atributos
        e além disso o Gerente (extends funcionario) vai pegar herdar os atributos do usario como
        também os métodos que há no funcionario e adicionado o metodo de +fecharCaixa();



        */
    }
}
