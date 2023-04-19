package models;

public class produto implements Comparable<produto>{
    public static models.produto notaProduto;
    private String produto;
    private double valor;
    private int quantidade;

    public produto(String produto, double valor,int quantidade) {
        this.produto = produto;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public double totalProduto ( double valor, int quantidade) {
        return this.quantidade * this.valor;
    }
    public String toString() {
    return "Produto: " + this.getProduto() + " Valor R$" + this.getValor() + " Quantidade " + this.getQuantidade();
}

    public String getProduto() {
        return produto;
    }

    public double getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public int compareTo(models.produto outroProd) {
        return this.getProduto().compareTo(outroProd.getProduto());

    }
}
