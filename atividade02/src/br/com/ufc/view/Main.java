package br.com.ufc.view;

import br.com.ufc.controllers.ManagerController;
import br.com.ufc.model.person.Client;

public class Main {
  public static void main(String[] args) throws Exception {
    ManagerController managerController = new ManagerController();
    Client client = new Client("Ronny Acacio", 479250, "Quixadá", 20, 'M');
    managerController.addClient(client);
    Client client1 = new Client("Ronny Acacio", 479250, "Quixadá", 20, 'M');
    managerController.addClient(client1);
  }
}
