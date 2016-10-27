package com.devfriendly.system.rendering.renderables;

import com.devfriendly.application.ApplicationConfig;
import com.devfriendly.input.Keyboard;
import com.devfriendly.system.Interactable;
import com.devfriendly.system.mob.MobSystem;
import javafx.scene.Group;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * Created by Shinn on 02.02.2016.
 */
public abstract class AbstractStageRenderer implements Interactable {

    @Autowired
    private ApplicationConfig applicationConfig;

    @Autowired
    private Keyboard keyboard;

    @Autowired
    private MobSystem mobSystem;



    protected ApplicationConfig getApplicationConfig() {
        return applicationConfig;
    }

    protected Keyboard getKeyboard() {
        return keyboard;
    }

    protected MobSystem getMobSystem() {
        return mobSystem;
    }

    @Override
    public abstract void clear();


    @Override
    public abstract void update();

    @Override
    public abstract void render(Group g);


}
