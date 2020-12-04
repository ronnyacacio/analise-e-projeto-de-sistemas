import model.Produto;
import model.RevendaComArray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Informe a quantidade de produtos para criar a revenda: ");
            int qtd = scanner.nextInt();

            RevendaComArray revenda = new RevendaComArray(qtd);

            int op = -1;
            while (op != 0) {
                System.out.println("1 - Criar produto");
                System.out.println("2 - Comprar");
                System.out.println("3 - Vender");
                System.out.println("4 - Consultar preço");
                System.out.println("5 - Listar Preços");
                System.out.println("6 - Alterar produtos");
                System.out.println("0 - Sair");

                System.out.print("Sua opção: ");
                op = scanner.nextInt();

                int codigo;
                String descricao;
                double vlCompra;
                double custo;
                double margemLucro;
                int quantidade;

                if (op == 1) {
                    System.out.println("Digíte os dados para criar o produto:");
                    System.out.print("Código: ");
                    codigo = scanner.nextInt();
                    System.out.print("Descrição: ");
                    descricao = scanner.next();
                    System.out.print("Valor de compra: ");
                    vlCompra = scanner.nextDouble();
                    System.out.print("Custo: ");
                    custo = scanner.nextDouble();
                    System.out.print("Margem de lucro: ");
                    margemLucro = scanner.nextDouble();
                    System.out.print("Quantidade inicial em estoque: ");
                    quantidade = scanner.nextInt();
                    Produto produto = new Produto(codigo, descricao, vlCompra, custo, margemLucro, quantidade);
                    revenda.inserirProduto(produto);
                    System.out.println("SUCESSO: Produto criado!");
                } else if (op == 2) {
                    System.out.println("Digíte os dados para comprar um produto:");
                    System.out.print("Código: ");
                    codigo = scanner.nextInt();
                    System.out.print("Quantidade desejada: ");
                    quantidade = scanner.nextInt();
                    revenda.comprar(codigo, quantidade);
                } else if (op == 3) {
                    System.out.println("Digíte os dados para vender um produto:");
                    System.out.print("Cógigo: ");
                    codigo = scanner.nextInt();
                    System.out.print("Quantidade desejada: ");
                    quantidade = scanner.nextInt();
                    revenda.vender(codigo, quantidade);
                } else if (op == 4) {
                    System.out.println("Digíte os dados para consultar o preço de algum produto:");
                    System.out.print("Cógigo: ");
                    codigo = scanner.nextInt();
                    revenda.consultaPrecoRevenda(codigo);
                } else if (op == 5) {
                    revenda.listaPrecos();
                } else if (op == 6) {
                    System.out.print("Digíte o código do produto escolhido: ");
                    codigo = scanner.nextInt();
                    System.out.println("\n\n");
                    Produto produto1 = revenda.getProdutoPorCodigo(codigo);
                    System.out.println("Qual informação você deseja alterar?");
                    System.out.println("1 - Valor de compra");
                    System.out.println("2 - Custo");
                    System.out.println("3 - Margem de lucro");

                    int op1 = scanner.nextInt();

                    switch (op1) {
                        case 1:
                            System.out.print("Digite o novo valor de compra: ");
                            double vlCompra1 = scanner.nextDouble();
                            produto1.setVlCompra(vlCompra1);
                            System.out.print("SUCESSO: Valor de compra alterado para: " + vlCompra1 + "\n\n");
                        case 2:
                            System.out.print("Digite o novo custo: ");
                            double custo1 = scanner.nextDouble();
                            produto1.setCusto(custo1);
                            System.out.print("SUCESSO: Custo alterado para: " + custo1 + "\n\n");
                        case 3:
                            System.out.print("Digite a nova margem de lucro: ");
                            double margemLucro1 = scanner.nextDouble();
                            produto1.setMargemLucro(margemLucro1);
                            System.out.print("SUCESSO: Margem de lucro alterada para: " + margemLucro1 + "\n\n");
                    }
                }
            }
            System.out.println("Fechando loja...\n");
        } catch (Exception err) {
            System.out.println("Erro interno!!!");
        }
    }
}
