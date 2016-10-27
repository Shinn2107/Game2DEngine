package com.devfriendly.game.mob.player;

import com.devfriendly.sprites.data.MobSprite;
import com.devfriendly.sprites.data.Sprite;

/**
 * Created by Shinn on 25.10.2016.
 */
public class HeroSprite extends MobSprite {

    public HeroSprite(String spriteImage, String transparentColor) {
        super(spriteImage, transparentColor);

        frames = 3;
        cols = 3;
        rows = 4;
        standingFrame = 2;

        loadMobSprites();
    }

    @Override
    public void animate() {

    }



    @Override
    protected void loadMobSprites() {



    }


}
