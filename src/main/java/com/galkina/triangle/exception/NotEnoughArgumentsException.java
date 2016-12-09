package com.galkina.triangle.exception;


public class NotEnoughArgumentsException extends Exception {

    public NotEnoughArgumentsException() {
    }

    public NotEnoughArgumentsException(String message) {
        super(message);
    }

    public NotEnoughArgumentsException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotEnoughArgumentsException(Throwable cause) {
        super(cause);
    }
}
