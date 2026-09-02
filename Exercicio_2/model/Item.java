package model;

public class Item {

    private int quantidade;
    private double precoVendaUnitario;
    private NotaFiscal notaFiscal;
    private Produto produto;

    public Item(NotaFiscal nf, Produto prod, int quantidade, double precoVendaUnitario) {

        if (nf == null || prod == null) {
            return;
        }

        this.notaFiscal = nf;
        this.produto = prod;
        this.quantidade = quantidade;
        this.precoVendaUnitario = precoVendaUnitario;

        nf.addItem(this);
        prod.addItem(this);
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoVendaUnitario() {
        return precoVendaUnitario;
    }

    public void setPrecoVendaUnitario(double precoVendaUnitario) {
        this.precoVendaUnitario = precoVendaUnitario;
    }

    public NotaFiscal getNotaFiscal() {
        return notaFiscal;
    }

    public Produto getProduto() {
        return produto;
    }

    public double calcularSubtotal() {
        return quantidade * precoVendaUnitario;
    }

    @Override
    public String toString() {
        return produto.getNome()
                + " | Quantidade: " + quantidade
                + " | Valor Unitário: R$ " + String.format("%.2f", precoVendaUnitario)
                + " | Subtotal: R$ " + String.format("%.2f", calcularSubtotal());
    }
}