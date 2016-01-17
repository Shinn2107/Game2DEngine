package com.devfriendly.game;

import javax.swing.*;

import com.devfriendly.application.ApplicationConfig;

/**
 * Created by Patrick Fey on 16.01.2016.
 */
public interface GameFrameService {

    JFrame buildGameFrame(GameWindow gameWindow,ApplicationConfig applicationConfig);
}
