package com.devfriendly.system.updating.impl;

import com.devfriendly.system.GameStateManager;
import com.devfriendly.system.exception.GameStateNotSetException;
import com.devfriendly.system.updating.GameUpdateHandler;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Patrick Fey on 17.01.2016.
 */
public class GameUpdateHandlerImpl implements GameUpdateHandler {


    @Autowired
    private GameStateManager gameStateManager;

    @Override
    public void update() {
        try {
            gameStateManager.getCurrentGameState().getInteractables()
                    .forEach(item -> item.update());
        } catch (GameStateNotSetException e) {
            e.printStackTrace();
        }

    }
}
