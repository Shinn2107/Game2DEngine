package com.devfriendly.system;

import com.devfriendly.system.rendering.Renderable;
import java.util.List;

/**
 * Created by Patrick Fey on 02.02.2016.
 */
public interface GameState {

    List<Renderable> getRenderables();

    String getGameStateName();

}
