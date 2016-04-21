package com.devfriendly.game.states.homescreen.renderer;

import com.devfriendly.input.button.AbstractButton;

import com.devfriendly.system.rendering.renderables.AbstractScreenRenderer;
import com.devfriendly.system.utils.ScreenUtils;
import org.apache.log4j.Logger;

import java.awt.*;

/**
 * Created by Shinn on 13.04.2016.
 */
public class SimpleHomeScreenButtonRenderer extends AbstractScreenRenderer {

    private static final Logger LOG = Logger.getLogger(SimpleHomeScreenButtonRenderer.class);

    private int currentMenuPoint = 0;


    @Override
    public void clear() {
        for (AbstractButton abstractButton : getButtons()) {
            abstractButton.setSelected(false);
        }

    }

    @Override
    public void render(Graphics g) {

        getButtons().get(currentMenuPoint).setSelected(true);

        int yCenter = ScreenUtils.findScreenCenter(getApplicationConfig().getHeight());
        int xCenter = ScreenUtils.findScreenCenter(getApplicationConfig().getWidth());

        int tempPosition = yCenter;
        for (AbstractButton button : getButtons()) {
            if(button.isSelected()){
                button.setR(255);
            }else{
                button.setR(0);
            }
            ScreenUtils.addButton(g, button,xCenter,tempPosition);
            tempPosition = ScreenUtils.addLineSpacing(tempPosition, button.getFontSize()+20);
        }

    }

    @Override
    public void update() {

        if(getKeyboard().up()){
            changeMenuPoint(currentMenuPoint-1);
        }
        if(getKeyboard().down()){
            changeMenuPoint(currentMenuPoint+1);
        }

        if(getKeyboard().enter()){

            getButtons().get(currentMenuPoint).perform();
        }


    }

    private void changeMenuPoint(int menuPoint) {

        if(menuPoint > getButtons().size()-1){
            menuPoint = 0;
        }else if(menuPoint < 0){
            menuPoint = getButtons().size()-1;
        }
        getButtons().get(menuPoint).setSelected(true);
        currentMenuPoint=menuPoint;
    }


}
