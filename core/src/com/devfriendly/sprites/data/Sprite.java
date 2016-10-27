package com.devfriendly.sprites.data;

import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shinn on 25.10.2016.
 */
public abstract class Sprite {

    private Image spriteImage;

    private String transparentColor;

    protected List<SpriteViewData> spriteViewDatas;

    public Sprite(String spriteImage,String transparentColor) {
        this.spriteImage = new Image(getClass().getResourceAsStream(spriteImage));
        this.transparentColor = transparentColor;
        spriteViewDatas = new ArrayList<>();
    }

    protected abstract void loadMobSprites();

    protected List<SpriteViewData> getSpriteViewData() {
        return spriteViewDatas;
    }
}
