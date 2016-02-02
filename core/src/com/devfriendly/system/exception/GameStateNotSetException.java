package com.devfriendly.system.exception;

/**
 * Created by Shinn on 02.02.2016.
 */
public class GameStateNotSetException extends Exception {

    public GameStateNotSetException() {
    }

    public GameStateNotSetException(String message) {
        super(message);
    }

    public GameStateNotSetException(String message, Throwable cause) {
        super(message, cause);
    }

    public GameStateNotSetException(Throwable cause) {
        super(cause);
    }

    public GameStateNotSetException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
