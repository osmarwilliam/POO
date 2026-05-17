package entities;

import java.util.ArrayList;

public class Agenda {

    public ArrayList<Contato> contatoList = new ArrayList<>();

    public void adicionarContato(Contato contatinho) {
        contatoList.add(contatinho);
        System.out.printf("Contato adicionado com sucesso %n %n");
    }

    // utlizando get para imprimir variáveis privadas
    public void exibirContatos() {
        // precisa verificar se ela é null e se ela está vazia
        // caso eu verifique apenas com isEmpty, mas se a lista n foi instanciada antes, irá apresentar um erro
        // de NullPointerException
        if (contatoList != null && !contatoList.isEmpty()) {
            for (Contato contatinho : contatoList) {
                System.out.println(
                    "nome: " +
                        contatinho.getNome() +
                        " , telefone: " +
                        contatinho.getTelefone()
                );
            }
        } else {
            System.out.println(
                "\nA agenda está vazia ou não foi inicializada.\n"
            );
        }
        System.out.println("");
    }

    public void removerContato(String nome) {
        // removeIf() vai percorrer toda lista até encontrar qualquer nome que seja igual aquele passado
        // chama tbm o método getNome() que vai retornar o nome daquele elemento que o C está passando no momento
        // daria pra fazer usando o for tbm, mas n seria tão elegante como essa expressão lambda

        boolean removido = contatoList.removeIf(contato ->
            contato.getNome().equalsIgnoreCase(nome)
        );

        if (removido) {
            System.out.println("\nContato excluído com sucesso!\n");
        } else {
            System.out.println("\nContato não encontrado!\n");
        }
    }

    public void agendaClear() {
        if (contatoList != null && !contatoList.isEmpty()) {
            contatoList.clear();
            System.out.println("\nTodos contatos foram apagados!\n");
        } else {
            System.out.println("\nNão há contatos para apagar!\n");
        }
    }
}
