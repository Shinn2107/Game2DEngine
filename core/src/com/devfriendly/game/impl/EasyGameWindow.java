package com.devfriendly.game.impl;

import javax.swing.*;

import org.springframework.beans.factory.annotation.Autowired;

import com.devfriendly.application.ApplicationConfig;
import com.devfriendly.game.GameWindow;
import com.devfriendly.game.exception.GameAlreadyStartedException;

/**
 * Created by Patrick Fey on 16.01.2016.
 */
public class EasyGameWindow extends GameWindow {

    private JFrame gameFrame;

    @Override
    public void startGame() throws GameAlreadyStartedException {
        if(gameFrame!=null){
            throw new GameAlreadyStartedException("Game already started and thus can't start again");
        }
        gameFrame = getGameFrameService().buildGameFrame(this,getApplicationConfig());
        gameFrame.setVisible(true);
        getGameLoop().start();
    }
}
