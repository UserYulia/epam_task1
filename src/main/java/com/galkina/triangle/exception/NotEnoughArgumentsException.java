package com.galkina.triangle.exception;

/**
 * Created by Yulia on 08.12.2016.
 */
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
