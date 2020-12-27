package br.com.ufc.view;

import java.util.ArrayList;

import br.com.ufc.controllers.ManagerController;
import br.com.ufc.model.product.Product;

public class ListProductsView {
  public static void main(String[] args) {
    ManagerController managerController = new ManagerController();

    ArrayList<Product> products = managerController.listProducts();

    System.out.println("\n");

    if (products.size() > 0)
      for (Product product : products)
        System.out.println(product.toString());

    System.out.println("\n");
  }
}
