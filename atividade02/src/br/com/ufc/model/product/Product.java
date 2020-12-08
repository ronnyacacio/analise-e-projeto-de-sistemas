package br.com.ufc.model.product;

public abstract class Product {
  private String code;
  private String title;
  private String gender;
  private boolean leased;

  public Product(String code, String title, String gender, boolean leased) {
    this.code = code;
    this.title = title;
    this.gender = gender;
    this.leased = leased;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public boolean isLeased() {
    return leased;
  }

  public void setLeased(boolean leased) {
    this.leased = leased;
  }
}
