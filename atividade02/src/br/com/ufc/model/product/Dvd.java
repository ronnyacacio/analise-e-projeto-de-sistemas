package br.com.ufc.model.product;

public class Dvd extends Movie {
  private boolean scratched;

  public Dvd(String code, String title, String gender, boolean leased, int yearOfLaunching, int duration,
      boolean scratched) {
    super(code, title, gender, leased, yearOfLaunching, duration);
    this.scratched = scratched;
  }

  public boolean isScratched() {
    return scratched;
  }

  public void setScratched(boolean scratched) {
    this.scratched = scratched;
  }
}
