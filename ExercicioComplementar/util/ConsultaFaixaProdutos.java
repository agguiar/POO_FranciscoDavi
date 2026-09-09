package util;

import java.util.SortedSet;
import java.util.TreeSet;

import model.ComparadorPorPreco;
import model.Produto;

public class ConsultaFaixaProdutos {

    private SortedSet<Produto> produtosPorPreco;

    public ConsultaFaixaProdutos() {

        produtosPorPreco =
                new TreeSet<>(new ComparadorPorPreco());

        produtosPorPreco.add(
                new Produto("P01", "Mouse", 80)
        );

        produtosPorPreco.add(
                new Produto("P02", "Teclado", 120)
        );

        produtosPorPreco.add(
                new Produto("P03", "Headset", 200)
        );

        produtosPorPreco.add(
                new Produto("P04", "Monitor", 900)
        );

        produtosPorPreco.add(
                new Produto("P05", "Notebook", 3500)
        );

    }

    public void exibirFaixa(double precoInicial, double precoFinal) {

        Produto inicio =
                new Produto("INICIO", "", precoInicial);

        Produto fim =
                new Produto("FIM", "", precoFinal);

        SortedSet<Produto> faixa =
                produtosPorPreco.subSet(inicio, fim);

        System.out.println("Produtos entre R$ "
                + precoInicial + " e R$ " + precoFinal + ":");

        for (Produto produto : faixa) {
            System.out.println(produto);
        }

    }

    public void exibirAbaixoDe(double preco) {

        Produto limite =
                new Produto("LIMITE", "", preco);

        SortedSet<Produto> abaixo =
                produtosPorPreco.headSet(limite);

        System.out.println("Produtos abaixo de R$ " + preco + ":");

        for (Produto produto : abaixo) {
            System.out.println(produto);
        }

    }

    public void exibirAPartirDe(double preco) {

        Produto limite =
                new Produto("LIMITE", "", preco);

        SortedSet<Produto> acima =
                produtosPorPreco.tailSet(limite);

        System.out.println("Produtos a partir de R$ " + preco + ":");

        for (Produto produto : acima) {
            System.out.println(produto);
        }

    }

}