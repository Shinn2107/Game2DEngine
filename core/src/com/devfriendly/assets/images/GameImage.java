package com.devfriendly.assets.images;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Created by Shinn on 02.02.2016.
 */
public class GameImage {

    private BufferedImage bufferedImage;

    public GameImage(String imageUrl) {
        try {
            this.bufferedImage = ImageIO.read(getClass().getResourceAsStream(imageUrl));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public BufferedImage getBufferedImage() {
        return bufferedImage;
    }
}
