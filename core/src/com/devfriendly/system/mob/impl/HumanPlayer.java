package com.devfriendly.system.mob.impl;

import com.devfriendly.application.ApplicationConfig;
import com.devfriendly.game.GameWindow;
import com.devfriendly.sprites.data.MobSprite;
import com.devfriendly.sprites.data.SpriteViewData;
import com.devfriendly.system.GameStateManager;
import com.devfriendly.system.camera.Camera;
import com.devfriendly.system.camera.impl.GameCameraImpl;
import com.devfriendly.system.mob.AbstractMob;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Shinn on 25.10.2016.
 */
public class HumanPlayer extends AbstractMob {

    @Autowired
    Camera camera;

    @Autowired
    GameWindow gameWindow;




    public HumanPlayer(MobSprite sprite, ApplicationConfig applicationConfig) {
        this.setSprite(sprite);
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

        camera.centerOnPlayer(this);
        /*getSprite().animate();
        SpriteViewData spriteViewData = getSprite().getCurrentSpriteViewData();*/
    }

    @Override
    public void update() {
        if(getKeyboard().down()){
            this.setyCoordinate(getyCoordinate()+6);

        }
        if(getKeyboard().up()){
            this.setyCoordinate(getyCoordinate()-6);
        }
        if(getKeyboard().right()){
            this.setxCoordinate(getxCoordinate()+6);

        }
        if(getKeyboard().left()){
            this.setxCoordinate(getxCoordinate()-6);
        }


    }


    @Override
    public void clear() {

    }
}
