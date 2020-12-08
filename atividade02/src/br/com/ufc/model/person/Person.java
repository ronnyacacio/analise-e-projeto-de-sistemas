package br.com.ufc.model.person;

public abstract class Person {
  private String name;
  private int registration;

  public Person(String name, int registration) {
    this.name = name;
    this.registration = registration;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getRegistration() {
    return registration;
  }
  public void setRegistration(int registration) {
    this.registration = registration;
  }  
}