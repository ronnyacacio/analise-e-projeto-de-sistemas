package br.com.ufc.model.person;

public class SystemOperator extends Employee {

  @Override
  public String toString() {
    return "SystemOperator [name=" + getName() + ", registration=" + getRegistration() + ", login=" + getLogin() + "]";
  }

  public SystemOperator(String name, int registration, String login, String password) {
    super(name, registration, login, password);
  }

  public SystemOperator(String login, String password) {
    super(login, password);
  }
}