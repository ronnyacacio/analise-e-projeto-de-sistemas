package br.com.ufc.exception;

public class PJLException extends Exception {
    public PJLException() {
        super("Produto já locado!");
    }
}