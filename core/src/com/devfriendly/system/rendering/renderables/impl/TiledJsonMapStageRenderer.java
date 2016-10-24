package com.devfriendly.system.rendering.renderables.impl;

import com.devfriendly.assets.map.impl.TiledJsonTileMap;
import com.devfriendly.assets.tileset.TileSet;
import com.devfriendly.system.rendering.renderables.AbstractMapStageRenderer;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.scene.Group;
import javafx.scene.image.ImageView;
import org.apache.log4j.Logger;

import java.io.IOException;

/**
 * Created by Shinn on 11.05.2016.
 */
public class TiledJsonMapStageRenderer extends AbstractMapStageRenderer {
    private static final Logger LOG = Logger.getLogger(TiledJsonMapStageRenderer.class);

    private TiledJsonTileMap tiledJsonTileMap;
    private ObjectMapper objectMapper = new ObjectMapper();

    public TiledJsonMapStageRenderer(String mapUrl) throws IOException {
        super(mapUrl);
        this.tiledJsonTileMap = objectMapper.readValue(getClass().getResourceAsStream(mapUrl),TiledJsonTileMap.class);
    }


    @Override
    public void clear() {

    }

    @Override
    public void update() {
    }

    @Override
    public void render(Group g) {

        for (TileSet tileSet : tiledJsonTileMap.getTileSetList()) {
            ImageView[] images = tileSet.getTileImages();
            for (int i = 0; i < images.length; i++) {
                ImageView image = images[i];
                image.setLayoutX(image.getViewport().getMaxX());
                image.setLayoutY(image.getViewport().getMaxY());
                g.getChildren().add(image);
            }
        }

        


    }

}
