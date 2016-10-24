package com.devfriendly.assets.images;

import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


/**
 * Created by Shinn on 24.10.2016.
 */
public class ImageViewData {

    private Image image;
    private Rectangle2D rectangle2D;

    public ImageViewData(Image image, Rectangle2D rectangle2D) {

        this.image=image;
        this.rectangle2D=rectangle2D;
    }

    public ImageView buildImageView(){
        ImageView imageView = new ImageView(image);
        imageView.setViewport( rectangle2D);
        return imageView;
    }
}
