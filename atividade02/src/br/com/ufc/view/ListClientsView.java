package br.com.ufc.view;

import java.util.ArrayList;

import br.com.ufc.controllers.ManagerController;
import br.com.ufc.model.person.Client;

public class ListClientsView {
  public static void main(String[] args) {
    ManagerController managerController = new ManagerController();

    ArrayList<Client> clients = managerController.listClients();

    System.out.println("\n");

    for (Client client : clients)
      System.out.println(client.toString());

    System.out.println("\n");
  }
}
