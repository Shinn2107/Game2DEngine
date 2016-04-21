package com.devfriendly.game.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.devfriendly.game.GameWindow;
import com.devfriendly.game.exception.GameAlreadyStartedException;

/**
 * Created by Patrick Fey on 16.01.2016.
 */
public class EasyGameWindow extends GameWindow {

    @Autowired
    private GameScreen gameFrame;

    @Override
    public void startGame() throws GameAlreadyStartedException {
        gameFrame.add(this);
        gameFrame.pack();
        gameFrame.setVisible(true);
        this.addKeyListener(getKeyboard().getListener());
        this.requestFocus();
        getGameLoop().start();
    }


    public GameScreen getGameFrame() {
        return gameFrame;
    }

    public void setGameFrame(GameScreen gameFrame) {
        this.gameFrame = gameFrame;
    }

}
