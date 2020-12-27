package br.com.ufc.model.person;

public class Manager extends Employee {

  public Manager(String name, int registration, String login, String password) {
    super(name, registration, login, password);
  }

  public Manager(String login, String password) {
    super(login, password);
  }
}
