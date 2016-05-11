package com.devfriendly.assets.images;

import javafx.scene.image.Image;

/**
 * Created by Shinn on 02.02.2016.
 */
public class GameImage {

    private Image image;

    public GameImage(String imageUrl) {

        this.image = new Image(getClass().getResourceAsStream(imageUrl));


    }


    public Image getImage() {
        return image;
    }
}
