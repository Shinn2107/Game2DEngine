package com.devfriendly.system.exception;

/**
 * Created by Shinn on 02.02.2016.
 */
public class GameStateNotFoundException extends Exception {

    public GameStateNotFoundException() {
    }

    public GameStateNotFoundException(String message) {
        super(message);
    }

    public GameStateNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public GameStateNotFoundException(Throwable cause) {
        super(cause);
    }

    public GameStateNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
