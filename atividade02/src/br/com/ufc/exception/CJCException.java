package br.com.ufc.exception;

public class CJCException extends Exception {
    public CJCException() {
        super("Cliente já cadastrado!");
    }
}