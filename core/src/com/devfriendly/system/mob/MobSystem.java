package com.devfriendly.system.mob;

import com.devfriendly.system.mob.Mob;

import java.util.Set;

/**
 * Created by Shinn on 25.10.2016.
 */
public interface MobSystem {

    void addMob(Mob mob);

    void removeMob(Mob mob);

    Set<Mob> getMobs();
}
