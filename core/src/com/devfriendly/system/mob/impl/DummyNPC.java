package com.devfriendly.system.mob.impl;

import com.devfriendly.input.button.AbstractButton;
import com.devfriendly.system.mob.AbstractMob;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.Random;

/**
 * Created by Shinn on 27.10.2016.
 */
public class DummyNPC extends AbstractMob {

    private Random random = new Random();

    public DummyNPC() {
        setWidth(32);
        setHeight(32);
        setxCoordinate(200);
        setyCoordinate(200);
    }

    @Override
    public void render(Group g) {
        Rectangle rect = new Rectangle(getxCoordinate(),getyCoordinate(),getWidth(),getHeight());
        rect.setFill(Color.DARKRED);

        g.getChildren().addAll(rect);
    }

    @Override
    public void update() {

        int rand = random.nextInt(100 - 1 + 1) + 1;
        switch (rand){
            case 1:
                setxCoordinate(getxCoordinate()+10);
                return;
            case 2:
                setxCoordinate(getxCoordinate()-10);
                return;
            case 3:
                setyCoordinate(getyCoordinate()+10);
                return;
            case 4:
                setyCoordinate(getyCoordinate()-10);
            default:
                return;
        }

    }

    @Override
    public void clear() {

    }
}
