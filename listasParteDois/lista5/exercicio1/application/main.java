package application;

import entities.ItemPedido;
import entities.Mercado;
import entities.PedidoCliente;
import entities.Produto;
import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mercado meuMercado = new Mercado();

        // cadastro dos itens no mercado
        Produto arroz = new Produto("Arroz 5kg", 25.50, 50);
        Produto feijao = new Produto("Feijão 1kg", 8.90, 30);

        // adiciono os produtos no mercado
        meuMercado.setProduto(arroz);
        meuMercado.setProduto(feijao);
        System.out.println("Estoque atual de Arroz: " + arroz.getEstoque());

        // simulando o pedido do cliente
        PedidoCliente pedido = new PedidoCliente(); // crio o pedido do cliente
        pedido.setItens(new ItemPedido(arroz, 2)); //
        pedido.dinheiro(100); //

        // pra retirar do estoque o pedido realizado pelo cliente
        meuMercado.processarPedido(pedido);

        System.out.println("Estoque atual de Arroz: " + arroz.getEstoque());

        sc.close();
    }
}
