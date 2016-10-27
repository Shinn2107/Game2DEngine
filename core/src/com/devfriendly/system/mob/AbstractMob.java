package com.devfriendly.system.mob;

import com.devfriendly.application.ApplicationConfig;
import com.devfriendly.input.Keyboard;
import com.devfriendly.sprites.data.MobSprite;
import com.devfriendly.sprites.data.Sprite;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Shinn on 25.10.2016.
 */
public abstract class AbstractMob implements Mob {

    protected Logger LOG = Logger.getLogger(AbstractMob.class);

    @Autowired
    private Keyboard keyboard;

    @Autowired
    ApplicationConfig applicationConfig;

    private int xCoordinate;
    private int yCoordinate;

    private int width;
    private int height;

    private String name;

    private MobSprite sprite;

    protected Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard){
        if(keyboard!=null){
            this.keyboard = keyboard;
        }
    }

    protected ApplicationConfig getApplicationConfig() {
        return applicationConfig;
    }

    public void setApplicationConfig(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    protected MobSprite getSprite() {
        return sprite;
    }

    protected void setSprite(MobSprite sprite) {
        this.sprite = sprite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
