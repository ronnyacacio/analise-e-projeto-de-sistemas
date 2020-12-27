package br.com.ufc.view;

import java.util.Scanner;

import br.com.ufc.controllers.ManagerController;
import br.com.ufc.model.person.SystemOperator;

public class FindSystemOperatorView {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ManagerController managerController = new ManagerController();

    System.out.println("Digite a matrícula do Cliente: ");
    Integer registration = scanner.nextInt();

    SystemOperator systemOperator = managerController.findSystemOperatorByRegistration(registration);

    if (systemOperator != null)
      System.out.println(systemOperator.toString());
  }
}
