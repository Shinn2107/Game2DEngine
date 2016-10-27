package com.devfriendly.system.rendering.renderables.impl;

import com.devfriendly.assets.map.impl.TiledJsonTileMap;
import com.devfriendly.assets.tileset.TileData;
import com.devfriendly.system.map.MapLoadingService;
import com.devfriendly.system.map.data.MapLayerData;
import com.devfriendly.system.map.impl.MapLoadingServiceImpl;
import com.devfriendly.system.mob.Mob;
import com.devfriendly.system.rendering.renderables.AbstractMapStageRenderer;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.scene.Group;
import javafx.scene.image.ImageView;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

/**
 * Created by Shinn on 11.05.2016.
 */
public class TiledJsonMapStageRenderer extends AbstractMapStageRenderer {
    private static final Logger LOG = Logger.getLogger(TiledJsonMapStageRenderer.class);

    private TiledJsonTileMap tiledJsonTileMap;
    private ObjectMapper objectMapper = new ObjectMapper();

    private List<TileData> tileDataList;
    private List<List<ImageView>> mapDataList;


    @Autowired
    private MapLoadingService mapRenderingService;


    public TiledJsonMapStageRenderer(String mapUrl) throws IOException {
        super(mapUrl);
        this.mapDataList = new ArrayList<>();
        this.tiledJsonTileMap = objectMapper.readValue(getClass().getResourceAsStream(mapUrl),TiledJsonTileMap.class);
    }


    @Override
    public void clear() {
    }

    @Override
    public void update() {
        getMobSystem().getMobs().stream().forEach(mob -> mob.update());
    }

    @Override
    public void render(Group g) {



        try {
            MapLayerData loadedMapData = mapRenderingService.loadMap(tiledJsonTileMap);
            if(loadedMapData!=null){
                for (String layerId : loadedMapData.getLayeredMapData().keySet()) {
                    renderTileInternal(g,loadedMapData, layerId);
                }
            }
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


        //iter through layers and render Mob on Player Layer

    }

    private void renderTileInternal(Group g, MapLayerData loadedMapData, String tileMapLayer) {
        if (tileMapLayer.equalsIgnoreCase(MapLoadingServiceImpl.PLAYER_LAYER_NAME)){
            renderMobs(g);
        }else{
            g.getChildren().addAll(loadedMapData.getLayeredMapData().get(tileMapLayer));
        }


    }

    private void renderMobs(Group g) {
        for (Mob mob : getMobSystem().getMobs()) {
            mob.render(g);
        }
    }

}
