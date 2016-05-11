package com.devfriendly.assets.map.impl;

import com.devfriendly.assets.tileset.TileSet;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by Shinn on 11.05.2016.
 */
public class TiledJsonTileMap {

    private int height;
    private int width;
    private String orientation;
    private int tileHeight;
    private int tileWidth;
    private String renderOrder;
    private int nextObjectId;
    private String version;


    private List<TileMapLayer> tileMapLayers;
    private List<TileSet> tileSetList;



    @JsonProperty("layers")
    public List<TileMapLayer> getTileMapLayers() {
        return tileMapLayers;
    }

    public void setTileMapLayers(List<TileMapLayer> tileMapLayers) {
        this.tileMapLayers = tileMapLayers;
    }

    @JsonProperty("tilesets")
    public List<TileSet> getTileSetList() {
        return tileSetList;
    }

    public void setTileSetList(List<TileSet> tileSetList) {
        this.tileSetList = tileSetList;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    @JsonProperty("tileheight")
    public int getTileHeight() {
        return tileHeight;
    }

    public void setTileHeight(int tileHeight) {
        this.tileHeight = tileHeight;
    }

    @JsonProperty("tilewidth")
    public int getTileWidth() {
        return tileWidth;
    }

    public void setTileWidth(int tileWidth) {
        this.tileWidth = tileWidth;
    }

    @JsonProperty("renderorder")
    public String getRenderOrder() {
        return renderOrder;
    }

    public void setRenderOrder(String renderOrder) {
        this.renderOrder = renderOrder;
    }

    @JsonProperty("nextobjectid")
    public int getNextObjectId() {
        return nextObjectId;
    }

    public void setNextObjectId(int nextObjectId) {
        this.nextObjectId = nextObjectId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}