package com.devfriendly.system;


import com.devfriendly.system.exception.GameStateNotFoundException;
import com.devfriendly.system.exception.GameStateNotSetException;

/**
 * Created by Patrick Fey on 02.02.2016.
 */
public interface GameStateManager {

    void setGameState(String gameState) throws GameStateNotFoundException;

    GameState getCurrentGameState() throws GameStateNotSetException;
}
