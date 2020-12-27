package br.com.ufc.view;

import java.util.Scanner;

import br.com.ufc.controllers.ManagerController;
import br.com.ufc.model.person.Manager;
import br.com.ufc.model.product.Product;

public class ManagerView {
  public static void main(String[] args, Manager manager) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("----Olá Gerente " + manager.getName() + "----");
    while (1 == 1) {
      System.out.println("1 - Cadastrar Produto");
      System.out.println("2 - Cadastrar Cliente");
      System.out.println("3 - Cadastrar Operador");
      System.out.println("4 - Listar Produtos");
      System.out.println("5 - Listar Clientes");
      System.out.println("6 - Listar Operadores");
      System.out.println("7 - Procurar Produto");
      System.out.println("8 - Procurar Cliente");
      System.out.println("9 - Procurar Operador");
      System.out.println("10 - Sair");

      int op = scanner.nextInt();

      if (op == 10)
        return;

      switch (op) {
        case 1:
          AddProductView.main(args);
          break;
        case 2:
          AddClientView.main(args);
          break;
        default:
          System.out.println("\nEscolha uma opção válida!\n");
          break;
      }
    }
  }
}
