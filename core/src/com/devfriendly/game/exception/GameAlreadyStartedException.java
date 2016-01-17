package com.devfriendly.game.exception;

/**
 * Created by Patrick Fey on 16.01.2016.
 */
public class GameAlreadyStartedException extends Exception {

    public GameAlreadyStartedException() {
    }

    public GameAlreadyStartedException(String message) {
        super(message);
    }

    public GameAlreadyStartedException(String message, Throwable cause) {
        super(message, cause);
    }

    public GameAlreadyStartedException(Throwable cause) {
        super(cause);
    }

    public GameAlreadyStartedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
