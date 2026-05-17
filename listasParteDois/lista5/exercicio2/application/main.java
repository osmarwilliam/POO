package application;

import entities.Agenda;
import entities.Contato;
import java.util.Scanner;

// esse deu trabalho, mas foi bem legal e acho que testei tudo!
public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Agenda agenda = new Agenda();
        int cond = 0;

        while (cond != 5) {
            menu();
            cond = sc.nextInt();
            if (cond == 1) {
                // adicionar contato

                // lixo no buffer
                sc.nextLine();

                Contato contato = new Contato();
                System.out.printf("Digite o nome do contato: ");

                // usando setters para alterar a variável privada
                contato.setNome(sc.nextLine());
                System.out.printf("Digite o telefone do contato:");
                contato.setTelefone(sc.nextInt());
                agenda.adicionarContato(contato);
            } else if (cond == 2) {
                // remover contato

                sc.nextLine();
                String nome;
                System.out.printf(
                    "Digite o nome do contato para ser removido: "
                );
                nome = sc.nextLine();
                agenda.removerContato(nome);
            } else if (cond == 3) {
                // exibir contatos/agenda

                agenda.exibirContatos();
            } else if (cond == 4) {
                // apagar toda agenda

                agenda.agendaClear();
            }
        }

        sc.close();
    }

    public static void menu() {
        System.out.println("---------Exibindo menu -------");
        System.out.println("1) Adicionar contato");
        System.out.println("2) Remover contato");
        System.out.println("3) Exibir contatos/agenda");
        System.out.println("4) Excluir agenda");
        System.out.println("5) Sair");
        System.out.printf("Escolha uma das opções: ");
    }
}
