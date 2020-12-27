package br.com.ufc.view;

import java.util.ArrayList;

import br.com.ufc.controllers.ManagerController;
import br.com.ufc.model.person.SystemOperator;

public class ListSystemOperatorsView {
  public static void main(String[] args) {
    ManagerController managerController = new ManagerController();

    ArrayList<SystemOperator> systemOperators = managerController.listSystemOperators();

    System.out.println("\n");

    for (SystemOperator systemOperator : systemOperators)
      System.out.println(systemOperator.toString());

    System.out.println("\n");
  }
}
