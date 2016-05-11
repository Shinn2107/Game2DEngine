package com.devfriendly.system.rendering.renderables;

import com.devfriendly.application.ApplicationConfig;
import com.devfriendly.input.Keyboard;
import com.devfriendly.input.button.AbstractButton;
import com.devfriendly.input.button.Button;
import com.devfriendly.system.Interactable;
import javafx.scene.Group;
import javafx.scene.canvas.GraphicsContext;
import org.springframework.beans.factory.annotation.Autowired;

import java.awt.*;
import java.util.List;


/**
 * Created by Shinn on 02.02.2016.
 */
public abstract class AbstractStageRenderer implements Interactable {

    @Autowired
    private ApplicationConfig applicationConfig;

    @Autowired
    private Keyboard keyboard;



    public ApplicationConfig getApplicationConfig() {
        return applicationConfig;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    @Override
    public abstract void clear();


    @Override
    public abstract void update();

    @Override
    public abstract void render(Group g);


}
