package com.devfriendly.input.impl;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import com.devfriendly.input.Keyboard;
import org.apache.log4j.Logger;


/**
 * Created by Patrick Fey on 17.01.2016.
 */
public class KeyboardImpl implements Keyboard, KeyListener {

    private static final Logger LOG = Logger.getLogger(KeyboardImpl.class);

    private boolean up = false;
    private boolean down = false;
    private boolean left = false;
    private boolean right = false;
    private boolean enter = false;


    @Override
    public boolean up() {
        if(up){
            up = false;
            return true;
        }
        return up;
    }

    @Override
    public boolean down() {
        if(down){
            down = false;
            return true;
        }
        return down;
    }

    @Override
    public boolean left() {
        if(left){
            left = false;
            return true;
        }
        return left;
    }

    @Override
    public boolean right() {
        if(right){
            right = false;
            return true;
        }
        return right;
    }

    @Override
    public boolean enter() {
        if(enter){
            enter = false;
            return true;
        }
        return enter;
    }

    @Override
    public KeyListener getListener() {
        return this;
    }


    @Override
    public void keyTyped(KeyEvent e) {
        keyPressed(e);
    }

    @Override
    public void keyPressed(KeyEvent e) {

        switch (e.getKeyCode()){
            case KeyEvent.VK_UP:
                up=true;
                break;
            case KeyEvent.VK_DOWN:
                down = true;
                break;
            case KeyEvent.VK_LEFT:
                left = true;
                break;
            case KeyEvent.VK_RIGHT:
                right = true;
                break;
            case KeyEvent.VK_ENTER:
                enter = true;
                break;
            default:break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        up = false;
        down = false;
        left = false;
        right = false;
    }
}
