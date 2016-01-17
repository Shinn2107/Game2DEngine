package com.devfriendly.application;

/**
 * Created by Patrick Fey on 15.01.2016.
 */
public class ApplicationConfig {
    private int width;
    private int height;
    private int scale;

    private String gameTitle;
    private boolean resizeable;

    public ApplicationConfig(int width, String gameTitle, boolean resizeable, int scale) {
        this.width = width;
        this.height = this.width / 16 * 9 ;
        this.gameTitle = gameTitle;
        this.resizeable = resizeable;
        this.scale = scale;
    }

    public ApplicationConfig(int width, int height, int scale, String gameTitle, boolean resizeable) {
        this.width = width;
        this.height = height;
        this.scale = scale;
        this.gameTitle = gameTitle;
        this.resizeable = resizeable;
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

    public int getScale() {
        return scale;
    }

    public void setScale(int scale) {
        this.scale = scale;
    }

    public String getGameTitle() {
        return gameTitle;
    }

    public void setGameTitle(String gameTitle) {
        this.gameTitle = gameTitle;
    }

    public boolean isResizeable() {
        return resizeable;
    }

    public void setResizeable(boolean resizeable) {
        this.resizeable = resizeable;
    }
}
