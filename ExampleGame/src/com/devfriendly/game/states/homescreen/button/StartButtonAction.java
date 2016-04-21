package com.devfriendly.game.states.homescreen.button;

import com.devfriendly.input.button.ButtonAction;
import com.devfriendly.system.GameStateManager;
import com.devfriendly.system.exception.GameStateNotFoundException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;

/**
 * Created by Shinn on 18.04.2016.
 */
public class StartButtonAction implements ButtonAction {

    private static final Logger LOG = Logger.getLogger(StartButtonAction.class);

    private GameStateManager gameStateManager;

    @Override
    public void performAction() {
        LOG.info("Clicked start button");

        try {
            getGameStateManager().setGameState("TEST_SCREEN");
        } catch (GameStateNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Lookup
    public GameStateManager getGameStateManager() {
        return gameStateManager;
    }

}
