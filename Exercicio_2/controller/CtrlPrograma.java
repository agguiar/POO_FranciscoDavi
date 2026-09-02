package controller;

import java.util.ArrayList;
import java.util.Collections;

import comparator.ComparadorPorCodigo;
import comparator.ComparadorPorPreco;
import model.Categoria;
import model.Fabricante;
import model.Item;
import model.NotaFiscal;
import model.Produto;

public class CtrlPrograma {

    public static Produto buscarPorCodigo(ArrayList<Produto> lista, String codigo) {

        for (Produto produto : lista) {

            if (produto.getCodigo().equalsIgnoreCase(codigo)) {
                return produto;
            }
        }

        return null;
    }

    public static void aplicarReajusteGeral(ArrayList<Produto> lista, double percentual) {

        for (Produto produto : lista) {

            double reajuste = produto.getPreco() * percentual / 100;
            produto.setPreco(produto.getPreco() + reajuste);
        }
    }

    public static void main(String[] args) {

        System.out.println("===== NÍVEL 1 =====");

        ArrayList<Produto> listaProdutos = new ArrayList<>();

        Produto p1 = new Produto("P001", "Notebook", 3500);
        Produto p2 = new Produto("P002", "Mouse", 100);
        Produto p3 = new Produto("P003", "Teclado", 250);
        Produto p4 = new Produto("P004", "Monitor", 1200);

        listaProdutos.add(p1);
        listaProdutos.add(p2);
        listaProdutos.add(p3);
        listaProdutos.add(p4);

        System.out.println("\nProdutos cadastrados:");

        for (Produto produto : listaProdutos) {
            System.out.println(produto);
        }

        System.out.println("\nQuantidade: " + listaProdutos.size());

        listaProdutos.remove(3);
        listaProdutos.remove(p2);

        System.out.println("\nApós as remoções:");

        for (Produto produto : listaProdutos) {
            System.out.println(produto);
        }

        System.out.println("Quantidade atual: " + listaProdutos.size());

        System.out.println("\n===== EXERCÍCIO 1.2 =====");

        Produto encontrado = buscarPorCodigo(listaProdutos, "P001");

        if (encontrado != null) {
            System.out.println("Produto encontrado:");
            System.out.println(encontrado);
        } else {
            System.out.println("Produto não encontrado");
        }

        encontrado = buscarPorCodigo(listaProdutos, "P999");

        if (encontrado != null) {
            System.out.println(encontrado);
        } else {
            System.out.println("Produto não encontrado");
        }

        aplicarReajusteGeral(listaProdutos, 10);

        System.out.println("\nPreços após reajuste de 10%:");

        for (Produto produto : listaProdutos) {
            System.out.println(produto);
        }

        System.out.println("\n===== NÍVEL 2.1 =====");

        Categoria informatica = new Categoria(1, "Informática");
        Categoria alimentos = new Categoria(2, "Alimentos");

        Produto computador = new Produto("C001", "Computador", 4000);
        Produto teclado = new Produto("C002", "Teclado", 200);

        Produto arroz = new Produto("A001", "Arroz", 30);
        Produto feijao = new Produto("A002", "Feijão", 10);

        informatica.adicionarProduto(computador);
        informatica.adicionarProduto(teclado);

        alimentos.adicionarProduto(arroz);
        alimentos.adicionarProduto(feijao);

        informatica.listarProdutos();

        System.out.println();

        alimentos.listarProdutos();

        System.out.println("\n===== NÍVEL 2.2 =====");

        Fabricante fabricanteA =
                new Fabricante("11.111.111/0001-11", "Fabricante A");

        Fabricante fabricanteB =
                new Fabricante("22.222.222/0001-22", "Fabricante B");

        Produto celular =
                new Produto("CEL01", "Celular", 2500);

        celular.setFabricante(fabricanteA);

        System.out.println("Depois de adicionar ao Fabricante A:");

        System.out.println(
                "Produtos Fabricante A: "
                + fabricanteA.getListaProdutos().size()
        );

        System.out.println(
                "Produtos Fabricante B: "
                + fabricanteB.getListaProdutos().size()
        );

        celular.setFabricante(fabricanteB);

        System.out.println("\nDepois de trocar para Fabricante B:");

        System.out.println(
                "Produtos Fabricante A: "
                + fabricanteA.getListaProdutos().size()
        );

        System.out.println(
                "Produtos Fabricante B: "
                + fabricanteB.getListaProdutos().size()
        );

        System.out.println(
                "Fabricante atual do produto: "
                + celular.getFabricante().getNome()
        );

        System.out.println("\n===== NÍVEL 3 =====");

        Produto produto1 =
                new Produto("NF01", "Notebook", 3500);

        Produto produto2 =
                new Produto("NF02", "Mouse", 100);

        Produto produto3 =
                new Produto("NF03", "Monitor", 1200);

        NotaFiscal nota =
                new NotaFiscal(1001, "02/09/2026");

        Item item1 =
                new Item(nota, produto1, 1, 3500);

        Item item2 =
                new Item(nota, produto2, 2, 90);

        Item item3 =
                new Item(nota, produto3, 2, 1100);

        System.out.println("Nota Fiscal: " + nota.getNumero());
        System.out.println("Data: " + nota.getData());

        System.out.println("\nItens:");

        for (Item item : nota.getListaItens()) {
            System.out.println(item);
        }

        System.out.printf(
                "\nTotal da Nota: R$ %.2f%n",
                nota.calcularTotalNota()
        );

        System.out.println("\n===== NÍVEL 4 =====");

        ArrayList<Produto> produtosOrdenacao = new ArrayList<>();

        produtosOrdenacao.add(
                new Produto("D04", "Teclado", 250)
        );

        produtosOrdenacao.add(
                new Produto("A01", "Notebook", 3500)
        );

        produtosOrdenacao.add(
                new Produto("C03", "Mouse", 100)
        );

        produtosOrdenacao.add(
                new Produto("B02", "Monitor", 1200)
        );

        System.out.println("\nOrdem natural - Nome:");

        Collections.sort(produtosOrdenacao);

        for (Produto produto : produtosOrdenacao) {
            System.out.println(produto);
        }

        System.out.println("\nPreço crescente:");

        Collections.sort(
                produtosOrdenacao,
                new ComparadorPorPreco()
        );

        for (Produto produto : produtosOrdenacao) {
            System.out.println(produto);
        }

        System.out.println("\nPreço decrescente:");

        Collections.sort(
                produtosOrdenacao,
                Collections.reverseOrder(
                        new ComparadorPorPreco()
                )
        );

        for (Produto produto : produtosOrdenacao) {
            System.out.println(produto);
        }

        System.out.println("\nOrdenação por código:");

        Collections.sort(
                produtosOrdenacao,
                new ComparadorPorCodigo()
        );

        for (Produto produto : produtosOrdenacao) {
            System.out.println(produto);
        }
    }
}
