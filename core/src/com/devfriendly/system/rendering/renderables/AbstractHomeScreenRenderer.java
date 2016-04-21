package com.devfriendly.system.rendering.renderables;


import com.devfriendly.input.ScreenElement;

import java.util.List;

/**
 * Created by Shinn on 12.04.2016.
 */
public abstract class AbstractHomeScreenRenderer extends AbstractScreenRenderer{

   private List<ScreenElement> screenElements;


    public List<ScreenElement> getScreenElements() {
        return screenElements;
    }

    public void setScreenElements(List<ScreenElement> screenElements) {
        this.screenElements = screenElements;
    }
}
