package br.com.ufc.view;

import java.util.Scanner;

import br.com.ufc.controllers.SystemOperatorController;
import br.com.ufc.model.product.Product;

public class RemoveLocationView {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    SystemOperatorController systemOperatorController = new SystemOperatorController();

    System.out.println("Digite o códido do produto: ");
    String code = scanner.next();
    Product product = systemOperatorController.findProductByCode(code);
    if (product == null)
      return;

    systemOperatorController.deallocate(product);
  }
}
