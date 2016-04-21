package com.devfriendly.game.states.testage.renderer;

import com.devfriendly.system.rendering.renderables.AbstractScreenRenderer;

import java.awt.*;

/**
 * Created by Shinn on 18.04.2016.
 */
public class TestSpriteRenderer extends AbstractScreenRenderer {
    @Override
    public void clear() {

    }

    @Override
    public void render(Graphics g) {

        g.setColor(Color.WHITE);
        g.drawString("NEW Stage Reached",100,100);

    }

    @Override
    public void update() {

    }
}
