package br.com.ufc.model.person;

public class SystemOperator extends Employee {

  public SystemOperator(String name, Integer registration) {
    super(name, registration);
  }

  @Override
  public String toString() {
    return "SystemOperator [name=" + getName() + ", registration=" + getRegistration() + ", login=" + getLogin() + "]";
  }
}