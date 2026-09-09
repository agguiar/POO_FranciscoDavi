package util;

import java.util.LinkedList;
import java.util.List;

public class GerenciadorFila {

    private List<String> fila = new LinkedList<>();

    public void adicionarPedidoInicio(String pedido) {
        fila.add(0, pedido);
    }

    public void adicionarPedidoFim(String pedido) {
        fila.add(pedido);
    }

    public void exibirFila() {

        for (String pedido : fila) {
            System.out.println(pedido);
        }

    }

}
