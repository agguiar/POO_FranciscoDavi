package util;

import java.util.LinkedList;
import java.util.Queue;

public class GerenciadorFilaPedidos {

    private Queue<String> fila = new LinkedList<>();

    public void adicionarPedido(String pedido) {

        fila.offer(pedido);

        System.out.println(
                pedido + " adicionado à fila."
        );

    }

    public void consultarProximoPedido() {

        String pedido = fila.peek();

        if (pedido != null) {

            System.out.println(
                    "Próximo pedido: " + pedido
            );

        } else {

            System.out.println(
                    "A fila está vazia."
            );

        }

    }

    public void processarPedido() {

        String pedido = fila.poll();

        if (pedido != null) {

            System.out.println(
                    "Pedido processado: " + pedido
            );

        } else {

            System.out.println(
                    "Não existem pedidos na fila."
            );

        }

    }

}