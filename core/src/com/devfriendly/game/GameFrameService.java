package com.devfriendly.game;

import com.devfriendly.game.impl.GameScreen;

/**
 * Created by Patrick Fey on 16.01.2016.
 */
public interface GameFrameService {

    GameScreen buildGameFrame(GameWindow gameWindow);
}
