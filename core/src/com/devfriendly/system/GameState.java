package com.devfriendly.system;

import java.util.List;

/**
 * Created by Patrick Fey on 02.02.2016.
 */
public interface GameState {

    List<Interactable> getInteractables();

    String getGameStateName();

}
