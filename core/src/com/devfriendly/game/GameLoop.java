package com.devfriendly.game;

/**
 * Created by Patrick Fey on 15.01.2016.
 */
public interface GameLoop extends Runnable {

    void start();
    void stop();
}
