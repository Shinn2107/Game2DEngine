package com.devfriendly.system;


/**
 * Created by Patrick Fey on 02.02.2016.
 */
public interface GameStateManager {



    void setGameState(GameState gameState);

    GameState getCurrentGameState();
}
