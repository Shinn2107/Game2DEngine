package com.devfriendly.game.impl;

import javax.swing.*;

import java.awt.*;

import com.devfriendly.application.ApplicationConfig;
import com.devfriendly.game.GameFrameService;
import com.devfriendly.game.GameWindow;

/**
 * Created by Patrick Fey on 16.01.2016.
 */
public class GameFrameServiceImpl implements GameFrameService {

    @Override
    public JFrame buildGameFrame(GameWindow easyGameWindow, ApplicationConfig applicationConfig) {
        final JFrame gameFrame = new JFrame();
        final Dimension dimension = new Dimension(applicationConfig.getWidth()*applicationConfig.getScale()
                        ,applicationConfig.getHeight()*applicationConfig.getScale());
        gameFrame.setPreferredSize(dimension);
        gameFrame.setTitle(applicationConfig.getGameTitle());
        gameFrame.setResizable(applicationConfig.isResizeable());
        gameFrame.add(easyGameWindow);
        gameFrame.pack();
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameFrame.setLocationRelativeTo(null);
        gameFrame.setVisible(false);
        return gameFrame;
    }
}
