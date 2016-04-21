package com.devfriendly.input;

import java.awt.event.KeyListener;

/**
 * Created by Patrick Fey on 17.01.2016.
 */
public interface Keyboard {

    boolean up();

    boolean down();

    boolean left();

    boolean right();

    boolean enter();

    KeyListener getListener();
}
