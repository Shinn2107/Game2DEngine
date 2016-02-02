package com.devfriendly.game.states.homescreen.renderer;

import com.devfriendly.assets.images.GameImage;
import com.devfriendly.system.rendering.AbstractScreenRenderer;
import com.devfriendly.system.rendering.Renderable;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by Patrick Fey on 02.02.2016.
 */
public class SimpleHomeScreenRenderer extends AbstractScreenRenderer implements Renderable {

    private final GameImage homescreen;

    public SimpleHomeScreenRenderer() {
        this.homescreen = new GameImage("/images/homescreen.jpg");
    }

    @Override
    public void render(Graphics g) {
        g.drawString("RENDERING WORKIN",100,100);
        g.drawImage(homescreen.getBufferedImage(),0,0,null);

    }

    @Override
    public void clear() {

    }
}
