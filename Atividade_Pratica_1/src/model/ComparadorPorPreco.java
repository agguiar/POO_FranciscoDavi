package model;

import java.util.Comparator;

public class ComparadorPorPreco implements Comparator<Produto> {

    @Override
    public int compare(Produto p1, Produto p2) {

        int resultado = Double.compare(p1.getPreco(), p2.getPreco());

        if (resultado == 0) {
            return p1.getCodigo().compareTo(p2.getCodigo());
        }

        return resultado;
    }

}