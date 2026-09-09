package model;

import interfaces.IRastreavel;

public class PacoteCorreios implements IRastreavel {

    private String codigo;

    public PacoteCorreios(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getStatusRastreio() {
        return "Correios: pacote " + codigo + " saiu para entrega.";
    }

}