package com.devfriendly.game.impl;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

import com.devfriendly.application.ApplicationConfig;
import com.devfriendly.system.rendering.Renderable;

/**
 * Created by Patrick Fey on 17.01.2016.
 */
public class GameScreen extends JFrame implements Renderable {

    private ApplicationConfig applicationConfig;

    private int[] pixels;

    private BufferedImage bufferedImage;

    public GameScreen(ApplicationConfig applicationConfig){
        this.applicationConfig = applicationConfig;
        final Dimension dimension = new Dimension(applicationConfig.getWidth()*applicationConfig.getScale()
                ,applicationConfig.getHeight()*applicationConfig.getScale());
        this.setPreferredSize(dimension);
        this.setTitle(applicationConfig.getGameTitle());
        this.setResizable(applicationConfig.isResizeable());
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(false);
        this.bufferedImage = new BufferedImage(applicationConfig.getWidth(),applicationConfig.getHeight(),BufferedImage.TYPE_INT_RGB);
        pixels = new int[applicationConfig.getWidth() * applicationConfig.getHeight()];
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(bufferedImage,0,0,getWidth(),getHeight(),null);
    }

    @Override
    public void clear() {
        for (int i=0; i < pixels.length; i++) {
            pixels[i] = 0;
        }
    }
}
