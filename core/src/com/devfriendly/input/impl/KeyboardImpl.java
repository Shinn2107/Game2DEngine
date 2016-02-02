package com.devfriendly.input.impl;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import org.springframework.beans.MethodInvocationException;
import org.springframework.beans.factory.annotation.Autowired;

import com.devfriendly.input.Keyboard;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by Patrick Fey on 17.01.2016.
 */
public class KeyboardImpl implements Keyboard, KeyListener {


    @Override
    public void update() {

    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new NotImplementedException();
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
