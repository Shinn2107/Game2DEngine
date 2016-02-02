package com.devfriendly.system.rendering;

import com.devfriendly.application.ApplicationConfig;
import com.devfriendly.game.GameWindow;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Shinn on 02.02.2016.
 */
public abstract class AbstractScreenRenderer {

    @Autowired
    private ApplicationConfig applicationConfig;


    public ApplicationConfig getApplicationConfig() {
        return applicationConfig;
    }
}
