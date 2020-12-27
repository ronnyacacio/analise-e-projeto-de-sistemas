package br.com.ufc.controllers;

import java.util.Date;

import br.com.ufc.exception.CNEException;
import br.com.ufc.exception.PJLException;
import br.com.ufc.exception.PNEException;
import br.com.ufc.exception.PNLException;
import br.com.ufc.model.person.Client;
import br.com.ufc.model.product.Product;
import br.com.ufc.repository.LocationRepository;
import br.com.ufc.repository.PersonRepository;
import br.com.ufc.repository.ProductRepository;

public class SystemOperatorController {
  ProductRepository productRepository = new ProductRepository();
  PersonRepository personRepository = new PersonRepository();
  LocationRepository locationRepository = new LocationRepository();

  String successMessage = "SUCESSO";
  String errorMessage = "ERRO: ";

  public void lease(Client client, Product product) {
    try {
      locationRepository.lease(client, product);
      System.out.println(successMessage);
    } catch (PJLException e) {
      System.out.println(errorMessage + e.getMessage());
    }
  }

  public void deallocate(Product product) {
    try {
      locationRepository.deallocate(product);
      System.out.println(successMessage);
    } catch (PNLException e) {
      System.out.println(errorMessage + e.getMessage());
    }
  }

  public void giveDown(Product product) {
    try {
      locationRepository.giveDown(product);
      System.out.println(successMessage);
    } catch (PNLException e) {
      System.out.println(errorMessage + e.getMessage());
    }
  }

  public Product findProductByCode(String code) {
    try {
      Product product = productRepository.findProductByCode(code);
      return product;
    } catch (PNEException e) {
      System.out.println(errorMessage + e.getMessage());
      return null;
    }
  }

  public Client findClientByRegistration(Integer registration) {
    try {
      Client client = personRepository.findClientByRegistration(registration);
      return client;
    } catch (CNEException e) {
      System.out.println(errorMessage + e.getMessage());
      return null;
    }
  }
}
