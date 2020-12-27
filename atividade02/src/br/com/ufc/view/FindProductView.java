package br.com.ufc.view;

import java.util.Scanner;

import br.com.ufc.controllers.ManagerController;
import br.com.ufc.model.product.Product;

public class FindProductView {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ManagerController managerController = new ManagerController();

    System.out.println("Digite o código do produto: ");
    String code = scanner.next();

    Product product = managerController.findProductByCode(code);

    if (product != null)
      System.out.println(product.toString());
  }
}
