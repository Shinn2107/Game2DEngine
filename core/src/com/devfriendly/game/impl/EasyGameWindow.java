package com.devfriendly.game.impl;

import javafx.event.EventType;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import org.springframework.beans.factory.annotation.Autowired;

import com.devfriendly.game.GameWindow;
import com.devfriendly.game.exception.GameAlreadyStartedException;

import javax.swing.*;

/**
 * Created by Patrick Fey on 16.01.2016.
 */
public class EasyGameWindow extends GameWindow {

    @Autowired
    private GameScreen gameScreen;



    public GameScreen getGameFrame() {
        return gameScreen;
    }

    public void setGameFrame(GameScreen gameFrame) {
        this.gameScreen = gameFrame;
    }

}
