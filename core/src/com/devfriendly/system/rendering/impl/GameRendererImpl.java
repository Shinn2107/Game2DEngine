package com.devfriendly.system.rendering.impl;

import java.awt.*;
import java.awt.image.BufferStrategy;

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
    
/*    private List<Renderable> rendererItems;*/

    @Override
    public void render() {
        BufferStrategy bs = gameWindow.getBufferStrategy();
        if(bs == null){
            gameWindow.createBufferStrategy(3);
            return;
        }
        final Graphics g = bs.getDrawGraphics();

        gameStateManager.getCurrentGameState().getRenderables()
                .forEach(item -> item.render(g));

        /*for (Renderable rendererItem : rendererItems) {
            rendererItem.render(g);
        }*/
        /*for (Renderable rendererItem : rendererItems) {
            rendererItem.clear();
        }*/

        g.dispose();
        bs.show();

    }

    /*public void setRendererItems(java.util.List rendererItems) {
        this.rendererItems = rendererItems;
    }

    public java.util.List getRendererItems() {
        return rendererItems;
    }*/
}
