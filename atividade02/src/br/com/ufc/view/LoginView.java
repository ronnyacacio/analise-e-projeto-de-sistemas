package br.com.ufc.view;

import java.util.Scanner;

import br.com.ufc.controllers.EmployeeController;
import br.com.ufc.model.person.Employee;
import br.com.ufc.model.person.Manager;
import br.com.ufc.model.person.SystemOperator;

public class LoginView {
  public static void main(String[] args, boolean isManager) {
    EmployeeController employeeController = new EmployeeController();

    Scanner scanner = new Scanner(System.in);
    System.out.println("----Faça seu Login----");
    System.out.println("Digite seu login: ");
    String login = scanner.next();
    System.out.println("Digite sua senha: ");
    String pass = scanner.next();

    Employee employee = employeeController.login(login, pass, isManager);

    if (employee == null)
      System.out.println("\nLogin incorreto. Tente novamente!\n");
    else {
      if (employee instanceof Manager)
        ManagerView.main(args, (Manager) employee);
      else
        SystemOperatorView.main(args, (SystemOperator) employee);
    }
  }
}
