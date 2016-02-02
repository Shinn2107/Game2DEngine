package com.devfriendly.system;

import java.util.List;

import com.devfriendly.system.rendering.Renderable;

/**
 * Created by Patrick Fey on 02.02.2016.
 */
public abstract class AbstractGameState implements GameState {

    private List<Renderable> renderables;
    private String gameStateName;

    protected void setRenderables(List<Renderable> renderables){
        this.renderables = renderables;
    }

    protected void setGameStateName(String gameStateName) {
        this.gameStateName = gameStateName;
    }

    @Override
    public List<Renderable> getRenderables() {
        return renderables;
    }

    @Override
    public String getGameStateName() {
        return gameStateName;
    }


}
