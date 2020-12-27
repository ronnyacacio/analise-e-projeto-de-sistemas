package br.com.ufc.view;

import java.text.ParseException;
import java.util.Scanner;

import br.com.ufc.model.person.SystemOperator;

public class SystemOperatorView {
  public static void main(String[] args, SystemOperator systemOperator) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("----Olá Operador " + systemOperator.getName() + "----");
    while (1 == 1) {
      System.out.println("\n1 - Fazer locação");
      System.out.println("2 - Dar baixa em locação");
      System.out.println("3 - Excluir locação");
      System.out.println("4 - Procurar Produto");
      System.out.println("5 - Procurar Cliente");
      System.out.println("6 - Sair");

      int op = scanner.nextInt();

      if (op == 6)
        return;

      switch (op) {
        case 1:
          AddLocationView.main(args);
          break;
        case 2:
          GiveDowLocationView.main(args);
          break;
        case 3:
          RemoveLocationView.main(args);
          break;
        case 4:
          FindProductView.main(args);
          break;
        case 5:
          FindClientView.main(args);
          break;
        default:
          System.out.println("\nEscolha uma opção válida!\n");
          break;
      }
    }
  }
}
