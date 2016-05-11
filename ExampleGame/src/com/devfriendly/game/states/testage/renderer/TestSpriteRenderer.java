package com.devfriendly.game.states.testage.renderer;

import com.devfriendly.system.rendering.renderables.AbstractStageRenderer;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

/**
 * Created by Shinn on 18.04.2016.
 */
public class TestSpriteRenderer extends AbstractStageRenderer {
    @Override
    public void clear() {

    }


    @Override
    public void update() {

    }

    @Override
    public void render(Group g) {
        Text text = new Text();
        text.setFill(Color.BLACK);
        text.setX(100);
        text.setY(100);
        text.setText("New Stage Reached");

        g.getChildren().addAll(text);

    }

}
