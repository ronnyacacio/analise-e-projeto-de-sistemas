package br.com.ufc.repository;

import java.util.ArrayList;
import java.util.Date;

import br.com.ufc.exception.PJLException;
import br.com.ufc.exception.PNLException;
import br.com.ufc.model.Location;
import br.com.ufc.model.person.Client;
import br.com.ufc.model.product.Product;

public class LocationRepository {
  private ArrayList<Location> locations = new ArrayList<Location>();
  
  public void lease(Client client, Product product, Date delivery) throws PJLException {
    if (!product.isLeased()) {
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
}
