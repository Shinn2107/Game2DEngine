package com.devfriendly.game.mob.impl;

import com.devfriendly.game.mob.player.HeroSprite;
import com.devfriendly.input.Keyboard;
import com.devfriendly.sprites.data.Sprite;
import com.devfriendly.system.mob.Mob;
import com.devfriendly.system.mob.MobFactory;
import com.devfriendly.system.mob.impl.HumanPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;

/**
 * Created by Shinn on 25.10.2016.
 */
public class MobFactoryImpl implements MobFactory {

    @Autowired
    Keyboard keyboard;

    @Override
    public Mob createPlayer() {

        HumanPlayer player = (HumanPlayer) getMob();
        player.setName("Lucis");


        return player;
    }

    @Lookup("heroPlayer")
    @Override
    public Mob getMob() {
        return null;
    }
}
