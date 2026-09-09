package util;

import java.util.SortedSet;
import java.util.TreeSet;

import model.ComparadorPorPreco;
import model.Produto;

public class CatalogoProdutos {

    public void catalogoNatural() {

        SortedSet<Produto> catalogoNatural = new TreeSet<>();

        catalogoNatural.add(new Produto("P03", "Mouse", 80));
        catalogoNatural.add(new Produto("P01", "Teclado", 120));
        catalogoNatural.add(new Produto("P02", "Monitor", 950));

        System.out.println("Catálogo por nome:");

        for (Produto produto : catalogoNatural) {
            System.out.println(produto);
        }

    }

    public void catalogoPreco() {

        SortedSet<Produto> catalogoPreco =
                new TreeSet<>(new ComparadorPorPreco());

        catalogoPreco.add(new Produto("P03", "Mouse", 80));
        catalogoPreco.add(new Produto("P01", "Teclado", 120));
        catalogoPreco.add(new Produto("P02", "Monitor", 950));

        System.out.println("Catálogo por preço:");

        for (Produto produto : catalogoPreco) {
            System.out.println(produto);
        }

    }

}