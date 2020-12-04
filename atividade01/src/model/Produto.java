package model;

public class Produto {
    private int codigo;
    private String descricao;
    private double vlCompra;
    private double custo;
    private double margemLucro;
    private int qtdEstoque;

    public Produto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Produto(int codigo, String descricao, double vlCompra, double custo, double margemLucro) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.vlCompra = vlCompra;
        this.custo = custo;
        this.margemLucro = margemLucro;
    }

    public Produto(int codigo, String descricao, double vlCompra, double custo, double margemLucro, int qtdEstoque) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.vlCompra = vlCompra;
        this.custo = custo;
        this.margemLucro = margemLucro;
        this.qtdEstoque = qtdEstoque;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getVlCompra() {
        return vlCompra;
    }

    public void setVlCompra(double vlCompra) {
        this.vlCompra = vlCompra;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public double getMargemLucro() {
        return margemLucro;
    }

    public void setMargemLucro(double margemLucro) {
        this.margemLucro = margemLucro;
    }

    public void compra(int quantity) {
        this.qtdEstoque += quantity;
    }

    public void venda(int quantity) {
        this.qtdEstoque -= quantity;
    }

    public double calculaPrecoVenda() {
        return this.vlCompra + this.custo + this.margemLucro * (this.vlCompra + this.custo);
    }
}
