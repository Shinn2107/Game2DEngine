package com.devfriendly.system.rendering.renderables;

import com.devfriendly.input.button.AbstractButton;

import java.util.List;

/**
 * Created by Shinn on 11.05.2016.
 */
public abstract class AbstractStartMenuStageRenderer extends AbstractStageRenderer {

    private List<AbstractButton> buttons;

    public List<AbstractButton> getButtons() {
        return buttons;
    }

    public void setButtons(List<AbstractButton> buttons) {
        this.buttons = buttons;
    }
}
