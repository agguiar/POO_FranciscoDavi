package model;

import java.util.ArrayList;

public class Fabricante {

    private String cnpj;
    private String nome;
    private ArrayList<Produto> listaProdutos;

    public Fabricante(String cnpj, String nome) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.listaProdutos = new ArrayList<>();
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void addProduto(Produto novo) {

        if (novo == null) {
            return;
        }

        if (listaProdutos.contains(novo)) {
            return;
        }

        listaProdutos.add(novo);
        novo.setFabricante(this);
    }

    public void removeProduto(Produto antigo) {

        if (antigo == null) {
            return;
        }

        if (!listaProdutos.contains(antigo)) {
            return;
        }

        listaProdutos.remove(antigo);

        if (antigo.getFabricante() == this) {
            antigo.setFabricante(null);
        }
    }
}