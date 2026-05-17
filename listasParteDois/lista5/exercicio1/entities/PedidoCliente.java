package entities;

import entities.Produto;
import java.util.ArrayList;

public class PedidoCliente {

    private ArrayList<ItemPedido> itens = new ArrayList<>();

    public void setItens(ItemPedido item) {
        this.itens.add(item);
    }

    public ArrayList<ItemPedido> getItens() {
        return this.itens;
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }

    public void dinheiro(double dinheiro) {
        double valorTotal = calcularTotal();
        if (valorTotal > dinheiro) {
            System.out.printf("Valor não cobre o total de :%.2f%n", valorTotal);
        } else {
            double troco = dinheiro - valorTotal;
            System.out.printf(
                "Pagamento realizado com sucesso, troco de :%.2f%n",
                troco
            );
        }
    }

    public void cheque() {
        System.out.println("Pagamento realizado cheque.");
    }

    public void cartao() {
        System.out.println("Pagamento realizado no cartão.");
    }
}
