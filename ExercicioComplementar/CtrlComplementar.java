package controller;

import util.ConsultaFaixaProdutos;
import util.GerenciadorFilaPedidos;
import util.GerenciadorSessoes;
import util.Colecoes;

public class CtrlComplementar {

    public static void main(String[] args) {

        System.out.println(
                "===== SORTEDSET ====="
        );

        ConsultaFaixaProdutos consulta =
                new ConsultaFaixaProdutos();

        consulta.exibirFaixa(100, 1000);

        consulta.exibirAbaixoDe(500);

        consulta.exibirAPartirDe(200);


        System.out.println(
                "\n===== QUEUE ====="
        );

        GerenciadorFilaPedidos fila =
                new GerenciadorFilaPedidos();

        fila.adicionarPedido("Pedido 001");
        fila.adicionarPedido("Pedido 002");
        fila.adicionarPedido("Pedido 003");

        fila.consultarProximoPedido();

        fila.processarPedido();

        fila.consultarProximoPedido();


        System.out.println(
                "\n===== COLLECTIONS ====="
        );

        Colecoes utilitarios =
                new Colecoes();

        utilitarios.executarUtilitarios();


        System.out.println(
                "\n===== HASHTABLE ====="
        );

        GerenciadorSessoes sessoes =
                new GerenciadorSessoes();

        sessoes.cadastrarSessoes();

        sessoes.exibirSessoes();

    }

}