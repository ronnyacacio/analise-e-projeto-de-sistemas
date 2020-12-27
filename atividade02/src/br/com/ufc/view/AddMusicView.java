package br.com.ufc.view;

import java.util.Scanner;

import br.com.ufc.controllers.ManagerController;
import br.com.ufc.model.product.Cd;
import br.com.ufc.model.product.Lp;

public class AddMusicView {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ManagerController managerController = new ManagerController();

    while (1 == 1) {
      System.out.println("1 - Cadastrar LP");
      System.out.println("2 - Cadastrar CD");
      System.out.println("3 - Sair");

      int op = scanner.nextInt();

      if (op == 4)
        return;

      System.out.println("Digite o codigo: ");
      String code = scanner.next();
      System.out.println("Digite o título: ");
      String title = scanner.next();
      System.out.println("Digite o gênero: ");
      String gender = scanner.next();

      System.out.println("\nDigite 1 se o DVD estiver alugado, caso contrário digite outro número qualquer: ");
      int opLeased = scanner.nextInt();
      boolean leased = false;
      if (opLeased == 1)
        leased = true;

      System.out.println("Digite o nome autor: ");
      String author = scanner.next();
      System.out.println("Digite o número de faixas: ");
      int numberOfTracks = scanner.nextInt();

      switch (op) {
        case 1:
          System.out.println("\nDigite 1 se o LP for raro, caso contrário digite outro número qualquer: ");
          int opRare = scanner.nextInt();
          boolean rare = false;
          if (opRare == 1)
            rare = true;

          Lp lp = new Lp(code, title, gender, leased, author, numberOfTracks, rare);
          managerController.addProduct(lp);
          break;
        case 2:
          System.out.println("\nDigite 1 se o CD estiver arranhado, caso contrário digite outro número qualquer: ");
          int opScratched = scanner.nextInt();
          boolean scratched = false;
          if (opScratched == 1)
            scratched = true;

          System.out.println("\n Digite 1 se o CD for dual, caso contrário digite outro número qualquer: ");
          int opDual = scanner.nextInt();
          boolean dual = false;
          if (opDual == 1)
            dual = true;

          Cd cd = new Cd(code, title, gender, leased, author, numberOfTracks, scratched, dual);
          managerController.addProduct(cd);
          break;
        default:
          System.out.println("\nEscolha uma opção válida!\n");
          break;
      }
    }
  }
}
