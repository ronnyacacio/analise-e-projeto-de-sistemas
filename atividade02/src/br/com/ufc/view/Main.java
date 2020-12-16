package br.com.ufc.view;

import java.util.Date;

import br.com.ufc.controllers.ManagerController;
import br.com.ufc.controllers.SystemOperatorController;
import br.com.ufc.model.person.Client;
import br.com.ufc.model.product.Dvd;

public class Main {
  public static void main(String[] args) throws Exception {
    ManagerController managerController = new ManagerController();
    SystemOperatorController systemOperatorController = new SystemOperatorController();

    Client client = new Client("Ronny Acacio", 479250, "Quixadá", 20, 'M');
    managerController.addClient(client);
    
    Dvd dvd = new Dvd("123@", "ProdutoTest", "Açao", false, 2014, 2, true);
    managerController.addProduct(dvd);
  
    systemOperatorController.lease(client, dvd, new Date());

    // systemOperatorController.deallocate(dvd);

    systemOperatorController.giveDown(dvd);
  }
}
