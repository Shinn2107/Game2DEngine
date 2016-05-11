package com.devfriendly.assets.tileset;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * Created by Shinn on 11.05.2016.
 */
public class TileSet {

    private int columns;
    private int firstgid;
    private String image;
    private int imageheight;
    private int imagewidth;
    private int margin;
    private String name;
    private int spacing;
    private int tilecount;
    private int tileheight;
    private int tilewidth;
    private String transparentColor;

    private ImageView[] tileImages;

    /**
     * Will return all Tiles for the TileSet in an Array. The first time this method is called it will
     * start loading the tiles, so that we dont stress the engine on the game startup
     * @return
     */
    @JsonIgnore
    public ImageView[] getTileImages(){
        if(tileImages!=null) return tileImages;
        return loadTiles();
    }

    private ImageView[] loadTiles() {
        tileImages = new ImageView[tilecount]; // could be plus + 1 depending

        int rowsToRead = getImageheight()/getTileheight();
        Image tileImage = new Image(getClass().getResourceAsStream(getImage()));


        double offsetPictureY = 0;
        int imageIndex = -1;
        for (int i = 0; i <rowsToRead; i++) {
            double offsetPictureX = 0;
            for (int j = 0; j < columns; j++) {
                imageIndex++;
                ImageView imageView = new ImageView(tileImage);
                imageView.setViewport( new Rectangle2D(offsetPictureX,offsetPictureY,getTilewidth(),getTileheight()));
                tileImages[imageIndex] = imageView;
                offsetPictureX+=getTilewidth();
            }
            offsetPictureY+=getTileheight();
        }


        return tileImages;
    }

    @JsonProperty("transparentcolor")
    public String getTransparentColor() {
        return transparentColor;
    }

    public void setTransparentColor(String transparentColor) {
        this.transparentColor = transparentColor;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public int getFirstgid() {
        return firstgid;
    }

    public void setFirstgid(int firstgid) {
        this.firstgid = firstgid;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        if(image.startsWith("../")){
            image = image.replaceAll("\\.\\./","/");
        }
        this.image = image;
    }

    public int getImageheight() {
        return imageheight;
    }

    public void setImageheight(int imageheight) {
        this.imageheight = imageheight;
    }

    public int getImagewidth() {
        return imagewidth;
    }

    public void setImagewidth(int imagewidth) {
        this.imagewidth = imagewidth;
    }

    public int getMargin() {
        return margin;
    }

    public void setMargin(int margin) {
        this.margin = margin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpacing() {
        return spacing;
    }

    public void setSpacing(int spacing) {
        this.spacing = spacing;
    }

    public int getTilecount() {
        return tilecount;
    }

    public void setTilecount(int tilecount) {
        this.tilecount = tilecount;
    }

    public int getTileheight() {
        return tileheight;
    }

    public void setTileheight(int tileheight) {
        this.tileheight = tileheight;
    }

    public int getTilewidth() {
        return tilewidth;
    }

    public void setTilewidth(int tilewidth) {
        this.tilewidth = tilewidth;
    }
}
