package model;

public class RevendaComArray {
    private Produto[] produtos;
    private int indice = 0;

    public RevendaComArray(int quantidade) {
        this.produtos = new Produto[quantidade];
    }

    public void inserirProduto(Produto produto) {
        this.produtos[this.indice] = produto;
        this.indice++;
    }

    public void comprar(int codigo, int qtd){
        for(Produto produto : this.produtos) {
            if (produto.getCodigo() == codigo) {
                produto.compra(qtd);
                System.out.println("SUCESSO: Produto adquirido!");
                return;
            }
        }
        System.out.println("ERRO: O produto requerido não existe!");
    }

    public void vender(int codigo, int qtd) {
        for(Produto produto : this.produtos) {
            if (produto.getCodigo() == codigo) {
                produto.venda(qtd);
                System.out.println("SUCESSO: Produto vendido!");
                return;
            }
        }
        System.out.println("ERRO: O produto requerido não existe!");
    }

    public void consultaPrecoRevenda(int codigo) {
        for(Produto produto : this.produtos) {
            if (produto.getCodigo() == codigo) {
                System.out.println("Valor de venda: " + produto.calculaPrecoVenda());
                return;
            }
        }
        System.out.println("ERRO: O produto requerido não existe!");
    }

    public void listaPrecos() {
        System.out.println("-----Todos os produtos-----");
        for(Produto produto : this.produtos) {
            System.out.println("\tCodigo: " + produto.getCodigo() + "; Descrição: " + produto.getDescricao() + "; Valor de venda: " + produto.calculaPrecoVenda());
        }
    }

    public Produto getProdutoPorCodigo(int codigo) {
        for(Produto produto : this.produtos)
            if(produto.getCodigo() == codigo)
                return produto;
        System.out.println("ERRO: O produto requerido não existe!");
        return null;
    }
}
