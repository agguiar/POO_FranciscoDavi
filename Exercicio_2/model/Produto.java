package model;

import java.util.ArrayList;

public class Produto implements Comparable<Produto> {

    private String codigo;
    private String nome;
    private double preco;
    private Fabricante fabricante;
    private ArrayList<Item> listaItens;

    public Produto(String codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.listaItens = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPrecoBase() {
        return preco;
    }

    public void setPrecoBase(double precoBase) {
        this.preco = precoBase;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public ArrayList<Item> getListaItens() {
        return listaItens;
    }

    public void setFabricante(Fabricante novoFab) {

        if (this.fabricante == novoFab) {
            return;
        }

        Fabricante antigo = this.fabricante;
        this.fabricante = novoFab;

        if (antigo != null) {
            antigo.removeProduto(this);
        }

        if (novoFab != null) {
            novoFab.addProduto(this);
        }
    }

    public void addItem(Item item) {

        if (item == null) {
            return;
        }

        if (listaItens.contains(item)) {
            return;
        }

        listaItens.add(item);
    }

    public void removeItem(Item item) {

        if (item == null) {
            return;
        }

        listaItens.remove(item);
    }

    @Override
    public int compareTo(Produto outro) {
        return this.nome.compareToIgnoreCase(outro.getNome());
    }

    @Override
    public String toString() {
        return "Código: " + codigo
                + " | Nome: " + nome
                + " | Preço: R$ " + String.format("%.2f", preco);
    }
}