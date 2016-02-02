package com.devfriendly.states.homescreen;

import com.devfriendly.system.AbstractGameState;
import java.util.List;
import com.devfriendly.system.rendering.Renderable;

/**
 * Created by Patrick Fey on 02.02.2016.
 */
public class SimpleHomeScreen extends AbstractGameState {


    public SimpleHomeScreen(String gameStateName, List<Renderable> renderableList) {
        setGameStateName(gameStateName);
        setRenderables(renderableList);
    }
}
