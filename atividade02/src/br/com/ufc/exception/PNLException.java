package br.com.ufc.exception;

public class PNLException extends Exception {
  public PNLException() {
    super("Produto não locado!");
  }
}