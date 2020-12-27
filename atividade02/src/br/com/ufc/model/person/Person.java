package br.com.ufc.model.person;

public abstract class Person {
  private String name;
  private Integer registration;

  public Person(String name, int registration) {
    this.name = name;
    this.registration = registration;
  }

  public Person() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getRegistration() {
    return registration;
  }

  public void setRegistration(Integer registration) {
    this.registration = registration;
  }
}