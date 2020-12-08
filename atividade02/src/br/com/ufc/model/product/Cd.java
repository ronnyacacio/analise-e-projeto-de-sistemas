package br.com.ufc.model.product;

public class Cd extends Music {
  private boolean scratched;
  private boolean dual;

  public Cd(String code, String title, String gender, boolean leased, String author, int numberOfTracks, boolean scratched, boolean dual) {
    super(code, title, gender, leased, author, numberOfTracks);
    this.scratched = scratched;
    this.dual = dual;
  }

  public boolean isScratched() {
    return scratched;
  }

  public void setScratched(boolean scratched) {
    this.scratched = scratched;
  }

  public boolean isDual() {
    return dual;
  }

  public void setDual(boolean dual) {
    this.dual = dual;
  }
}
