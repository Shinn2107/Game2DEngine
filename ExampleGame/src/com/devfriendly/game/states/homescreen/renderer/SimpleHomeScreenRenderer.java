package com.devfriendly.game.states.homescreen.renderer;

import com.devfriendly.assets.images.GameImage;
import com.devfriendly.system.rendering.renderables.AbstractScreenRenderer;
import org.apache.log4j.Logger;

import java.awt.*;

/**
 * Created by Patrick Fey on 02.02.2016.
 */
public class SimpleHomeScreenRenderer extends AbstractScreenRenderer {

    private final GameImage homescreen;

    private static final Logger LOG = Logger.getLogger(SimpleHomeScreenRenderer.class);

    public SimpleHomeScreenRenderer() {
        this.homescreen = new GameImage("/images/homescreen.jpg");
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(homescreen.getBufferedImage(),0,0,getApplicationConfig().getWidth(),getApplicationConfig().getHeight(),null);
    }

    @Override
    public void update() {

    }
    @Override
    public void clear() {



    }
}
