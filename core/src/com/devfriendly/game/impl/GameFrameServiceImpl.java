package com.devfriendly.game.impl;

import javax.annotation.Resource;
import javax.swing.*;

import java.awt.*;

import org.springframework.beans.factory.annotation.Autowired;

import com.devfriendly.application.ApplicationConfig;
import com.devfriendly.game.GameFrameService;
import com.devfriendly.game.GameWindow;

/**
 * Created by Patrick Fey on 16.01.2016.
 */
public class GameFrameServiceImpl implements GameFrameService {

    @Resource(name = "applicationConfig")
    private ApplicationConfig applicationConfig;


    @Override
    public GameScreen buildGameFrame(GameWindow easyGameWindow) {
        final GameScreen gameFrame = new GameScreen(applicationConfig);
        final Dimension dimension = new Dimension(applicationConfig.getWidth()*applicationConfig.getScale()
                        ,applicationConfig.getHeight()*applicationConfig.getScale());
        /*gameFrame.setPreferredSize(dimension);
        gameFrame.setTitle(applicationConfig.getGameTitle());
        gameFrame.setResizable(applicationConfig.isResizeable());
        gameFrame.add(easyGameWindow);
        gameFrame.pack();
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameFrame.setLocationRelativeTo(null);*/
        gameFrame.setVisible(false);
        return gameFrame;
    }
}
