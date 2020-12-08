package br.com.ufc.model.product;

public class Lp extends Music {
  private boolean rare;

  public Lp(String code, String title, String gender, boolean leased, String author, int numberOfTracks, boolean rare) {
    super(code, title, gender, leased, author, numberOfTracks);
    this.rare = rare;
  }

  public boolean isRare() {
    return rare;
  }

  public void setRare(boolean rare) {
    this.rare = rare;
  }
}
