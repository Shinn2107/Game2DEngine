package com.devfriendly.system.gamestates;

import com.devfriendly.system.GameState;
import com.devfriendly.system.Interactable;

import java.util.List;

/**
 * Created by Patrick Fey on 02.02.2016.
 */
public class AbstractGameState implements GameState {

    private List<Interactable> interactables;
    private String gameStateName;


    public AbstractGameState(List<Interactable> interactables, String gameStateName) {
        this.interactables = interactables;
        this.gameStateName = gameStateName;
    }

    protected void setGameStateName(String gameStateName) {
        this.gameStateName = gameStateName;
    }

    @Override
    public List<Interactable> getInteractables() {
        return interactables;
    }

    public void setInteractables(List<Interactable> interactables) {
        this.interactables = interactables;
    }

    @Override
    public String getGameStateName() {
        return gameStateName;
    }


}
