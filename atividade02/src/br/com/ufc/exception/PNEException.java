package br.com.ufc.exception;

public class PNEException extends Exception {
    public PNEException() {
        super("Produto não encontrado!");
    }
}