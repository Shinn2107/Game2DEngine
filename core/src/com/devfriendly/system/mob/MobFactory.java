package com.devfriendly.system.mob;

import com.devfriendly.system.mob.impl.HumanPlayer;

/**
 * Created by Shinn on 25.10.2016.
 */
public interface MobFactory {

    Mob createPlayer();

    Mob getMob();

}
