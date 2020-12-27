package br.com.ufc.model.person;

public class Client extends Person {
  private String address;
  private int age;
  private char sex;

  public Client(String name, Integer registration, String address, int age, char sex) {
    super(name, registration);
    this.address = address;
    this.age = age;
    this.sex = sex;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public char getSex() {
    return sex;
  }

  public void setSex(char sex) {
    this.sex = sex;
  }

  @Override
  public String toString() {
    return "Client [name=" + getName() + ", registration=" + getRegistration() + ", address=" + address + ", age=" + age
        + ", sex=" + sex + "]";
  }
}
