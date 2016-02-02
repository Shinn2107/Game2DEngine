package com.devfriendly.system.rendering.impl;

import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import com.devfriendly.system.exception.GameStateNotSetException;
import org.springframework.beans.factory.annotation.Autowired;

import com.devfriendly.game.GameWindow;
import com.devfriendly.system.GameStateManager;
import com.devfriendly.system.rendering.GameRenderer;

/**
 * Created by Patrick Fey on 17.01.2016.
 */
public class GameRendererImpl implements GameRenderer {
    @Autowired
    GameWindow gameWindow;

    @Autowired
    GameStateManager gameStateManager;

    BufferedImage bufferedImage;

    @Override
    public void render() {
        BufferStrategy bs = gameWindow.getBufferStrategy();
        if(bs == null){
            gameWindow.createBufferStrategy(3);
            return;
        }
        final Graphics g = bs.getDrawGraphics();

        g.drawImage(getBufferedImage(), 0, 0, gameWindow.getWidth(), gameWindow.getHeight(), null);
        try {
            gameStateManager.getCurrentGameState().getRenderables()
                    .forEach(item -> item.render(g));
            gameStateManager.getCurrentGameState().getRenderables()
                    .forEach(item -> item.clear());
        } catch (GameStateNotSetException e) {
            e.printStackTrace();
        }

        g.dispose();
        bs.show();

    }

    private BufferedImage getBufferedImage() {
        if(bufferedImage==null){
            bufferedImage = new BufferedImage(gameWindow.getWidth(),gameWindow.getHeight(),BufferedImage.TYPE_INT_RGB);
        }
        return bufferedImage;
    }

}
