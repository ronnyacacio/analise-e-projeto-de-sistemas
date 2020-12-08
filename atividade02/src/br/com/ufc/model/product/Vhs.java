package br.com.ufc.model.product;

public class Vhs extends Movie {
  private boolean colorful;

  public Vhs(String code, String title, String gender, boolean leased, int yearOfLaunching, int duration,
      boolean colorful) {
    super(code, title, gender, leased, yearOfLaunching, duration);
    this.colorful = colorful;
  }

  public boolean isColorful() {
    return colorful;
  }

  public void setColorful(boolean colorful) {
    this.colorful = colorful;
  }
}
