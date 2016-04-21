package com.devfriendly.system.rendering.renderables;

import com.devfriendly.application.ApplicationConfig;
import com.devfriendly.input.Keyboard;
import com.devfriendly.input.button.AbstractButton;
import com.devfriendly.input.button.Button;
import com.devfriendly.system.Interactable;
import org.springframework.beans.factory.annotation.Autowired;

import java.awt.*;
import java.util.List;


/**
 * Created by Shinn on 02.02.2016.
 */
public abstract class AbstractScreenRenderer implements Interactable {

    @Autowired
    private ApplicationConfig applicationConfig;

    @Autowired
    private Keyboard keyboard;

    private List<AbstractButton> buttons;


    public ApplicationConfig getApplicationConfig() {
        return applicationConfig;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    @Override
    public abstract void clear();

    @Override
    public abstract void render(Graphics g);

    @Override
    public abstract void update();

    public List<AbstractButton> getButtons() {
        return buttons;
    }

    public void setButtons(List<AbstractButton> buttons) {
        this.buttons = buttons;
    }
}
