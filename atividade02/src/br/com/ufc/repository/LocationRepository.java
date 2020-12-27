package br.com.ufc.repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import br.com.ufc.exception.PJLException;
import br.com.ufc.exception.PNLException;
import br.com.ufc.model.Location;
import br.com.ufc.model.person.Client;
import br.com.ufc.model.product.Product;

public class LocationRepository {
  private static ArrayList<Location> locations = new ArrayList<Location>();

  public void lease(Client client, Product product) throws PJLException {
    if (!product.isLeased()) {
      Date delivery = this.calcDelivery();

      Location location = new Location(product.getCode(), client.getRegistration(), new Date(), delivery);
      product.setLeased(true);
      locations.add(location);
      return;
    }
    throw new PJLException();
  }

  public Location deallocate(Product product) throws PNLException {
    if (product.isLeased()) {
      for (Location location : locations) {
        if (location.getCode().equals(product.getCode())) {
          locations.remove(location);
          return location;
        }
      }
    }
    throw new PNLException();
  }

  public void giveDown(Product product) throws PNLException {
    try {
      Location location = this.deallocate(product);
      location.fine();
    } catch (PNLException e) {
      throw new PNLException();
    }
  }

  private Date calcDelivery() {
    Date now = new Date();
    Calendar calendar = Calendar.getInstance();
    calendar.set(now.getYear(), now.getMonth(), now.getDay());
    calendar.add(Calendar.DAY_OF_MONTH, 2);
    Date delivery = calendar.getTime();

    return delivery;
  }
}
