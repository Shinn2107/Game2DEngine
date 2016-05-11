package com.devfriendly.input.impl;


import com.devfriendly.input.Keyboard;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.input.KeyEvent;
import org.apache.log4j.Logger;


/**
 * Created by Patrick Fey on 17.01.2016.
 */
public class KeyboardImpl implements Keyboard, EventHandler<KeyEvent> {

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
    public EventHandler<KeyEvent> getListener() {
        return this;
    }



    public void keyTyped(KeyEvent e) {
        keyPressed(e);
    }

    public void keyPressed(KeyEvent e) {
        switch (e.getCode()){
            case UP:
                up=true;
                break;
            case DOWN:
                down = true;
                break;
            case LEFT:
                left = true;
                break;
            case RIGHT:
                right = true;
                break;
            case ENTER:
                enter = true;
                System.out.println("Enter");
                break;
            default:break;
        }

    }

    public void keyReleased(KeyEvent e) {
        up = false;
        down = false;
        left = false;
        right = false;
    }

    @Override
    public void handle(KeyEvent e) {

        if(e.getEventType()== KeyEvent.KEY_TYPED){
            keyTyped(e);
        }
        if(e.getEventType()== KeyEvent.KEY_PRESSED){
            keyPressed(e);
        }


    }

}
