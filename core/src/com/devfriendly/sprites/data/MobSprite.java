package com.devfriendly.sprites.data;

/**
 * Created by Shinn on 25.10.2016.
 */
public abstract class MobSprite extends Sprite {

    protected int rows;
    protected int cols;

    protected int frames;
    protected int standingFrame;


    protected SpriteViewData currentSpriteView;

    public MobSprite(String spriteImage, String transparentColor) {
        super(spriteImage, transparentColor);
    }

    public abstract void animate();

    public SpriteViewData getCurrentSpriteViewData(){
        return currentSpriteView;
    }
}
