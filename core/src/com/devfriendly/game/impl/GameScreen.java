package com.devfriendly.game.impl;


import java.awt.*;
import java.awt.image.BufferedImage;

import com.devfriendly.application.ApplicationConfig;
import javafx.scene.canvas.Canvas;

/**
 * Created by Patrick Fey on 17.01.2016.
 */
public class GameScreen extends Canvas {

    private ApplicationConfig applicationConfig;

    private int[] pixels;

    private BufferedImage bufferedImage;

    public GameScreen(ApplicationConfig applicationConfig){
        this.applicationConfig = applicationConfig;
        this.setWidth(applicationConfig.getWidth());
        this.setHeight(applicationConfig.getHeight());
        /*this.setTitle(applicationConfig.getGameTitle());
        this.setResizable(applicationConfig.isResizeable());
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);*/
        this.setVisible(false);
        this.bufferedImage = new BufferedImage(applicationConfig.getWidth(),applicationConfig.getHeight(),BufferedImage.TYPE_INT_RGB);
        pixels = new int[applicationConfig.getWidth() * applicationConfig.getHeight()];
    }
}
