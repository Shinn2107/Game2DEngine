package com.devfriendly.system.impl;

import java.util.Map;

import com.devfriendly.system.GameState;
import com.devfriendly.system.GameStateManager;

/**
 * Created by Patrick Fey on 02.02.2016.
 */
public class GameStateManagerImpl implements GameStateManager {
    private Map<String,GameState> gameStateList;

    public void setGameStateList(Map<String, GameState> gameStateList) {
        this.gameStateList = gameStateList;
    }

    public Map<String, GameState> getGameStateList() {
        return gameStateList;
    }

    @Override
    public void setGameState(GameState gameState) {

    }

    @Override
    public GameState getCurrentGameState() {
        return null;
    }
}
