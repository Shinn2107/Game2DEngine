package com.devfriendly.system.impl;

import java.util.Map;

import com.devfriendly.system.GameState;
import com.devfriendly.system.GameStateManager;
import com.devfriendly.system.exception.GameStateNotFoundException;
import com.devfriendly.system.exception.GameStateNotSetException;

/**
 * Created by Patrick Fey on 02.02.2016.
 */
public class GameStateManagerImpl implements GameStateManager {
    private Map<String,GameState> gameStateList;
    private GameState currentGameState;


    public GameStateManagerImpl(Map<String, GameState> gameStateList){
        this.gameStateList = gameStateList;
    }


    public Map<String, GameState> getGameStateList() {
        return gameStateList;
    }

    @Override
    public void setGameState(String gameState) throws GameStateNotFoundException {
        if(gameStateList.containsKey(gameState)){
            this.currentGameState = gameStateList.get(gameState);
            return;
        }
        throw new GameStateNotFoundException("The game state: "+gameState+" could not be found please check your configuration");
    }

    @Override
    public GameState getCurrentGameState() throws GameStateNotSetException {
        if(currentGameState==null){
            throw new GameStateNotSetException("No gameState has been set please see that before starting the application you have set one.");
        }
        return currentGameState;
    }
}
