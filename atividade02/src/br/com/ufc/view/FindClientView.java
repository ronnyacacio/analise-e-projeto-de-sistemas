package br.com.ufc.view;

import java.util.Scanner;

import br.com.ufc.controllers.ManagerController;
import br.com.ufc.model.person.Client;

public class FindClientView {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ManagerController managerController = new ManagerController();

    System.out.println("Digite a matrícula do Cliente: ");
    Integer registration = scanner.nextInt();

    Client client = managerController.findClientByRegistration(registration);

    if (client != null)
      System.out.println(client.toString());
  }
}
