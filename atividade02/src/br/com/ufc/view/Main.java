package br.com.ufc.view;

import java.util.Scanner;

import br.com.ufc.controllers.ManagerController;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ManagerController managerController = new ManagerController();

    managerController.init();

    while (1 == 1) {
      System.out.println("----Bem-vindo, escolha um perfil abaixo: ");
      System.out.println("\n1 - Gerente");
      System.out.println("2 - Operador de Sistema");
      System.out.println("3 - Sair");
      System.out.print("Digite a opção: ");

      int op = scanner.nextInt();

      if (op == 3)
        System.exit(0);

      switch (op) {
        case 1:
          LoginView.main(args, true);
          break;
        case 2:
          LoginView.main(args, false);
          break;
        default:
          System.out.println("\nEscolha uma opção válida!\n");
          break;
      }
    }
  }
}
