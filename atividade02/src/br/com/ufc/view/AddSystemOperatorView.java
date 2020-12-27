package br.com.ufc.view;

import java.util.Scanner;

import br.com.ufc.controllers.ManagerController;
import br.com.ufc.model.person.SystemOperator;

public class AddSystemOperatorView {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ManagerController managerController = new ManagerController();

    System.out.println("Digite o nome: ");
    String name = scanner.next();
    System.out.println("Digite a matrícula: ");
    Integer registration = scanner.nextInt();

    SystemOperator systemOperator = new SystemOperator(name, registration);
    managerController.addSystemOperator(systemOperator);
  }
}
