package br.com.ufc.exception;

public class CNEException extends Exception {
    public CNEException() {
        super("Cliente não encontrado!");
    }
}