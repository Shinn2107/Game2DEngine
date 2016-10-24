package com.devfriendly.system.rendering.renderables.impl;

import com.devfriendly.assets.map.impl.TileMapLayer;
import com.devfriendly.assets.map.impl.TiledJsonTileMap;
import com.devfriendly.assets.tileset.TileSet;
import com.devfriendly.system.rendering.renderables.AbstractMapStageRenderer;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.scene.Group;
import javafx.scene.image.ImageView;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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



        for (TileMapLayer tileMapLayer : tiledJsonTileMap.getTileMapLayers()) {
            if(tileMapLayer.isVisible()) {

                for (int y = 0; y < tileMapLayer.getHeight(); y++) {
                    for (int x = 0; x < tileMapLayer.getWidth(); x++) {
                        int rowToTake = y == 1 ? 0 + x  : y*tileMapLayer.getWidth()+x;
                        int imageToPlace = tileMapLayer.getData()[rowToTake]-1;

                        if(imageToPlace>=0){

                            int widthX = x * tiledJsonTileMap.getTileWidth();
                            int widthY = y *tiledJsonTileMap.getTileHeight();
                            for (TileSet tileSet : tiledJsonTileMap.getTileSetList()) {
                                ImageView imageView = tileSet.getTileImages().get(imageToPlace).buildImageView();

                                imageView.setLayoutX(widthX);
                                imageView.setLayoutY(widthY);

                                g.getChildren().add(imageView);
                            }
                        }
                    }
                }


            }

        }



    }

}
