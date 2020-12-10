package br.com.ufc.exception;

public class PJCException extends Exception {
    public PJCException() {
        super("Produto já cadastrado!");
    }
}