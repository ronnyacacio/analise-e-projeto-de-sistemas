package br.com.ufc.model.product;

public abstract class Music extends Product {
  private String author;
  private int numberOfTracks;

  public Music(String code, String title, String gender, boolean leased, String author, int numberOfTracks) {
    super(code, title, gender, leased);
    this.author = author;
    this.numberOfTracks = numberOfTracks;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public int getNumberOfTracks() {
    return numberOfTracks;
  }

  public void setNumberOfTracks(int numberOfTracks) {
    this.numberOfTracks = numberOfTracks;
  }
}
