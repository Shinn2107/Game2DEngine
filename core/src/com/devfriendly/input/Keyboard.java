package com.devfriendly.input;

import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;

/**
 * Created by Patrick Fey on 17.01.2016.
 */
public interface Keyboard {

    boolean up();

    boolean down();

    boolean left();

    boolean right();

    boolean enter();

    EventHandler<KeyEvent> getListener();
}
