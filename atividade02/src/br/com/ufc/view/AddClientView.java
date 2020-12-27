package br.com.ufc.view;

import java.util.Scanner;
import br.com.ufc.controllers.ManagerController;
import br.com.ufc.model.person.Client;

public class AddClientView {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ManagerController managerController = new ManagerController();

    System.out.println("Digite o nome: ");
    String name = scanner.next();
    System.out.println("Digite a matrícula: ");
    Integer registration = scanner.nextInt();
    System.out.println("Digite o endereço: ");
    String address = scanner.next();
    System.out.println("Digite a idade: ");
    int age = scanner.nextInt();

    System.out.println("\nDigite o sexo: ");
    char sex = 'M';
    int opSex = 0;

    while (opSex != 1 && opSex != 2) {
      System.out.println("1 - Masculino");
      System.out.println("2 - Feminino");
      opSex = scanner.nextInt();

      if (opSex == 1)
        sex = 'M';
      if (opSex == 2)
        sex = 'F';
    }

    Client client = new Client(name, registration, address, age, sex);
    managerController.addClient(client);
  }
}
