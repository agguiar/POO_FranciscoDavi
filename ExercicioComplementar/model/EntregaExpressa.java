package model;

import interfaces.IRastreavel;

public class EntregaExpressa implements IRastreavel {

    private String codigo;

    public EntregaExpressa(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getStatusRastreio() {
        return "Entrega Expressa: pedido " + codigo + " será entregue hoje.";
    }

}