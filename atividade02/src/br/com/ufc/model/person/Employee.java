package br.com.ufc.model.person;

public class Employee extends Person {
  private String login;
  private String password;

  public Employee(String name, int registration, String login, String password) {
    super(name, registration);
    this.login = login;
    this.password = password;
  }

  public Employee(String login, String password) {
    this.login = login;
    this.password = password;
  }

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
