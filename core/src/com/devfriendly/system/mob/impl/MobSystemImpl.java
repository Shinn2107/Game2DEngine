package com.devfriendly.system.mob.impl;

import com.devfriendly.system.mob.Mob;
import com.devfriendly.system.mob.MobSystem;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Shinn on 25.10.2016.
 */
public class MobSystemImpl implements MobSystem {

    private Set<Mob> mobList = new HashSet<>();


    @Override
    public void addMob(Mob mob) {
        mobList.add(mob);
    }

    @Override
    public void removeMob(Mob mob) {
        mobList.remove(mob);
    }

    @Override
    public Set<Mob> getMobs() {
        return mobList;
    }
}
