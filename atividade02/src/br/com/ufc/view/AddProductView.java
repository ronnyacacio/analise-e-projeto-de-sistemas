package br.com.ufc.view;

import java.util.Scanner;

public class AddProductView {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (1 == 1) {
      System.out.println("1 - Cadastrar Filme");
      System.out.println("2 - Cadastrar Música");
      System.out.println("3 - Sair");

      int op = scanner.nextInt();

      if (op == 3)
        return;

      switch (op) {
        case 1:
          AddMovieView.main(args);
          break;
        case 2:
          AddMusicView.main(args);
          break;
        default:
          System.out.println("\nEscolha uma opção válida!\n");
          break;
      }
    }
  }
}
