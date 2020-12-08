package br.com.ufc.model.product;

public abstract class Movie extends Product {
  private int yearOfLaunching;
  private int duration;

  public Movie(String code, String title, String gender, boolean leased, int yearOfLaunching, int duration) {
    super(code, title, gender, leased);
    this.yearOfLaunching = yearOfLaunching;
    this.duration = duration;
  }

  public int getYearOfLaunching() {
    return yearOfLaunching;
  }

  public void setYearOfLaunching(int yearOfLaunching) {
    this.yearOfLaunching = yearOfLaunching;
  }

  public int getDuration() {
    return duration;
  }

  public void setDuration(int duration) {
    this.duration = duration;
  }
}
