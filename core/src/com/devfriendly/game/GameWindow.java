package com.devfriendly.game;

import javax.annotation.Resource;
import java.awt.*;

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
    @Resource(name = "gameFrameService")
    private GameFrameService gameFrameService;


    public ApplicationConfig getApplicationConfig() {
        return applicationConfig;
    }

    public GameLoop getGameLoop() {
        return gameLoop;
    }

    public GameFrameService getGameFrameService() {
        return gameFrameService;
    }

    public abstract void startGame() throws GameAlreadyStartedException, GameAlreadyStartedException;


}
