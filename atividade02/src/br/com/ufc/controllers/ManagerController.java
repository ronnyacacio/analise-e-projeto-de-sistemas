package br.com.ufc.controllers;

import java.util.ArrayList;

import br.com.ufc.exception.CJCException;
import br.com.ufc.exception.CNEException;
import br.com.ufc.exception.PJCException;
import br.com.ufc.exception.PNEException;
import br.com.ufc.exception.SOJCException;
import br.com.ufc.exception.SONEException;
import br.com.ufc.model.person.Client;
import br.com.ufc.model.person.SystemOperator;
import br.com.ufc.model.product.Product;
import br.com.ufc.repository.PersonRepository;
import br.com.ufc.repository.ProductRepository;

public class ManagerController {
  PersonRepository personRepository = new PersonRepository();
  ProductRepository productRepository = new ProductRepository();

  String successMessage = "SUCESSO";
  String errorMessage = "ERRO: ";

  public void addClient(Client client) {
    try {
      personRepository.addClient(client);
      System.out.println(successMessage);
    } catch (CJCException e) {
      System.out.println(errorMessage + e.getMessage());
    }
  }

  public void addProduct(Product product) {
    try {
      productRepository.addProduct(product);
      System.out.println(successMessage);
    } catch (PJCException e) {
      System.out.println(errorMessage + e.getMessage());
    }
  }

  public void addSystemOperator(SystemOperator systemOperator) {
    try {
      personRepository.addSystemOperator(systemOperator);
      System.out.println(successMessage);
    } catch (SOJCException e) {
      System.out.println(errorMessage + e.getMessage());
    }
  }

  public ArrayList<Client> listClients() {
    try {
      ArrayList<Client> clients = personRepository.listClients();
      return clients;
    } catch (CNEException e) {
      System.out.println(errorMessage + e.getMessage());
      return null;
    }
  }

  public ArrayList<Product> listProducts() {
    try {
      ArrayList<Product> products = productRepository.listProdutcs();
      return products;
    } catch (PNEException e) {
      System.out.println(errorMessage + e.getMessage());
      return null;
    }
  }

  public ArrayList<SystemOperator> listSystemOperators() {
    try {
      ArrayList<SystemOperator> operators = personRepository.listSystemOperators();
      return operators;
    } catch (SONEException e) {
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

  public Product findProductByCode(String code) {
    try {
      Product product = productRepository.findProductByCode(code);
      return product;
    } catch (PNEException e) {
      System.out.println(errorMessage + e.getMessage());
      return null;
    }
  }

  public SystemOperator findSystemOperatorByRegistration(Integer registration) {
    try {
      SystemOperator systemOperator = personRepository.findSystemOperatorByRegistration(registration);
      return systemOperator;
    } catch (SONEException e) {
      System.out.println(errorMessage + e.getMessage());
      return null;
    }
  }
}
