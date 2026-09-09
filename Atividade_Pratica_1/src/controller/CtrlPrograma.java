package controller;

import model.CargaTransportadora;
import model.CupomDesconto;
import model.EntregaExpressa;
import model.PacoteCorreios;

import util.CatalogoProdutos;
import util.EstoquePDV;
import util.GerenciadorCupons;
import util.GerenciadorFila;
import util.RegistradorEventos;

public class CtrlPrograma {

    public static void main(String[] args) {

        System.out.println("===== MISSÃO 1 =====");

        CentralRastreamento.inspecionarItem(
                new PacoteCorreios("BR123")
        );

        CentralRastreamento.inspecionarItem(
                new CargaTransportadora("TR456")
        );

        CentralRastreamento.inspecionarItem(
                new EntregaExpressa("EX789")
        );

        CentralRastreamento.inspecionarItem(
                "Objeto comum"
        );


        System.out.println("\n===== MISSÃO 2 =====");

        GerenciadorFila fila = new GerenciadorFila();

        fila.adicionarPedidoInicio("Pedido 001");
        fila.adicionarPedidoFim("Pedido 002");
        fila.adicionarPedidoFim("Pedido 003");

        fila.exibirFila();


        RegistradorEventos eventos = new RegistradorEventos();

        eventos.registrarEvento("Login realizado.");
        eventos.registrarEvento("Pedido aprovado.");

        eventos.exibirEventos();


        System.out.println("\n===== MISSÃO 3 =====");

        GerenciadorCupons cupons = new GerenciadorCupons();

        cupons.testarInsercao();

        cupons.adicionarCupom(
                new CupomDesconto("FRETE", 0)
        );

        cupons.adicionarCupom(
                new CupomDesconto("VIP20", 20)
        );

        System.out.println("Antes da limpeza:");

        cupons.exibirCupons();

        cupons.limparCuponsZerados();

        System.out.println("Depois da limpeza:");

        cupons.exibirCupons();


        System.out.println("\n===== MISSÃO 4 =====");

        CatalogoProdutos catalogo = new CatalogoProdutos();

        catalogo.catalogoNatural();
        catalogo.catalogoPreco();


        System.out.println("\n===== MISSÃO 5 =====");

        EstoquePDV estoque = new EstoquePDV();

        estoque.cadastrarProdutos();

        estoque.exibirCodigos();

        estoque.exibirProdutos();

        estoque.consultarProduto();

    }

}