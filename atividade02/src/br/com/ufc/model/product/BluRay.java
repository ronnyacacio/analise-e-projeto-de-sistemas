package br.com.ufc.model.product;

public class BluRay extends Movie {
  private String[] languages = new String[2];

  public BluRay(String code, String title, String gender, boolean leased, int yearOfLaunching, int duration, String[] languages) {
    super(code, title, gender, leased, yearOfLaunching, duration);
    this.languages = languages;
  }

  public String[] getLanguages() {
    return languages;
  }

  public void setLanguages(String[] languages) {
    this.languages = languages;
  }
}
