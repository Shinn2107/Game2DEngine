package com.devfriendly.game.states.homescreen.renderer;

import com.devfriendly.assets.images.GameImage;
import com.devfriendly.system.rendering.renderables.AbstractStartMenuStageRenderer;
import javafx.scene.Group;
import javafx.scene.image.ImageView;
import org.apache.log4j.Logger;

/**
 * Created by Patrick Fey on 02.02.2016.
 */
public class SimpleHomeScreenRenderer extends AbstractStartMenuStageRenderer {

    private final GameImage homescreen;

    private static final Logger LOG = Logger.getLogger(SimpleHomeScreenRenderer.class);

    public SimpleHomeScreenRenderer() {
        this.homescreen = new GameImage("/images/homescreen.jpg");
    }


    @Override
    public void update() {

    }

    @Override
    public void render(Group g) {
        final ImageView homescreenView = new ImageView(homescreen.getImage());
        g.getChildren().add(homescreenView);
    }


    @Override
    public void clear() {



    }
}
