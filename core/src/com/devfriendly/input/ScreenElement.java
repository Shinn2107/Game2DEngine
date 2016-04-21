package com.devfriendly.input;

import com.devfriendly.system.updating.Updateable;

/**
 * Created by Shinn on 13.04.2016.
 */
public abstract class ScreenElement implements Updateable{

    private Double positionX;
    private Double positionY;


    @Override
    public abstract void update();

    public Double getPositionX() {
        return positionX;
    }

    public void setPositionX(Double positionX) {
        this.positionX = positionX;
    }

    public Double getPositionY() {
        return positionY;
    }

    public void setPositionY(Double positionY) {
        this.positionY = positionY;
    }
}
