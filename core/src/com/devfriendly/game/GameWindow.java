package com.devfriendly.game;

import javax.annotation.Resource;
import java.awt.*;

import com.devfriendly.input.Keyboard;
import org.springframework.beans.factory.annotation.Autowired;

import com.devfriendly.application.ApplicationConfig;
import com.devfriendly.game.exception.GameAlreadyStartedException;

/**
 * Created by Patrick Fey on 16.01.2016.
 */
public abstract class GameWindow extends Canvas {
    @Resource(name = "applicationConfig")
    private ApplicationConfig applicationConfig;

    @Resource(name = "gameLoop")
    private GameLoop gameLoop;

    @Resource(name = "keyboard")
    private Keyboard keyboard;

    public void setApplicationConfig(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
    }

    public void setGameLoop(GameLoop gameLoop) {
        this.gameLoop = gameLoop;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public ApplicationConfig getApplicationConfig() {
        return applicationConfig;
    }

    public GameLoop getGameLoop() {
        return gameLoop;
    }

    public abstract void startGame() throws GameAlreadyStartedException;


}
