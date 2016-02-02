package com.devfriendly.game.states.homescreen;

import com.devfriendly.system.AbstractGameState;
import java.util.List;
import com.devfriendly.system.rendering.Renderable;

/**
 * Created by Patrick Fey on 02.02.2016.
 */
public class SimpleHomeScreenState extends AbstractGameState {


    public SimpleHomeScreenState(String gameStateName, List<Renderable> renderableList) {
        setGameStateName(gameStateName);
        setRenderables(renderableList);
    }
}
