package br.com.ufc.view;

import java.util.Scanner;

import br.com.ufc.controllers.ManagerController;
import br.com.ufc.model.product.Dvd;
import br.com.ufc.model.product.Vhs;
import br.com.ufc.model.product.BluRay;

public class AddMovieView {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ManagerController managerController = new ManagerController();

    while (1 == 1) {
      System.out.println("\n1 - Cadastrar um DVD");
      System.out.println("2 - Cadastrar um VHS");
      System.out.println("3 - Cadastrar um Blu-Ray");
      System.out.println("4 - Sair");

      int op = scanner.nextInt();

      if (op == 4)
        return;

      System.out.println("Digite o codigo: ");
      String code = scanner.next();
      System.out.println("Digite o título: ");
      String title = scanner.next();
      System.out.println("Digite o gênero: ");
      String gender = scanner.next();
      System.out.println("Digite o ano de lançamento: ");
      int yearOfLaunching = scanner.nextInt();
      System.out.println("Digite a duração: ");
      int duration = scanner.nextInt();

      switch (op) {
        case 1:
          System.out.println("\nDigite 1 se o DVD estiver arranhado, caso contrário digite outro número qualquer: ");
          int opScratched = scanner.nextInt();
          boolean scratched = false;
          if (opScratched == 1)
            scratched = true;

          Dvd dvd = new Dvd(code, title, gender, false, yearOfLaunching, duration, scratched);
          managerController.addProduct(dvd);
          break;
        case 2:
          System.out.println("\nDigite 1 se o VHS for a cores, caso contrário digite outro número qualquer: ");
          int opColorful = scanner.nextInt();
          boolean colorful = false;
          if (opColorful == 1)
            colorful = true;

          Vhs vhs = new Vhs(code, title, gender, false, yearOfLaunching, duration, colorful);
          managerController.addProduct(vhs);
          break;
        case 3:
          System.out.println("Digite o primeiro idioma disponível para o BluRay: ");
          String languageOne = scanner.next();
          System.out.println("Digite o segundo idioma disponível para o BluRay: ");
          String languageTwo = scanner.next();
          String[] languages = new String[2];
          languages[0] = languageOne;
          languages[1] = languageTwo;

          BluRay bluRay = new BluRay(code, title, gender, false, yearOfLaunching, duration, languages);
          managerController.addProduct(bluRay);
          break;
        default:
          System.out.println("\nEscolha uma opção válida!\n");
          break;
      }
    }
  }
}
