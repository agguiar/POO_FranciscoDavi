package model;

import interfaces.IRastreavel;

public class CargaTransportadora implements IRastreavel {

    private String codigo;

    public CargaTransportadora(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getStatusRastreio() {
        return "Transportadora: carga " + codigo + " em trânsito.";
    }

}