package com.devfriendly.system.map.impl;

import com.devfriendly.assets.map.impl.TileMapLayer;
import com.devfriendly.assets.map.impl.TiledJsonTileMap;
import com.devfriendly.system.converter.Converter;
import com.devfriendly.system.map.MapContext;
import com.devfriendly.system.map.MapLoadingService;
import com.devfriendly.system.map.TileLoadingService;
import com.devfriendly.system.map.data.MapContextData;
import com.devfriendly.system.map.data.MapLayerData;
import com.devfriendly.system.map.data.LoadedTileData;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import javafx.scene.image.ImageView;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * Created by Shinn on 27.10.2016.
 */
public class MapLoadingServiceImpl implements MapLoadingService {

    public static final String PLAYER_LAYER_NAME="Player";

    @Autowired
    private TileLoadingService tileLoadingService;

    @Autowired
    private MapContext mapContext;

    @Autowired
    private Converter<TiledJsonTileMap, MapContextData> tiledJsonTileMapMapContextDataConverter;

    private LoadingCache<TiledJsonTileMap, MapLayerData> mapCache;

    public MapLoadingServiceImpl(){
        mapCache = CacheBuilder.newBuilder()
                .maximumSize(50)
                .expireAfterWrite(5, TimeUnit.MINUTES)
                .build(new CacheLoader<TiledJsonTileMap, MapLayerData>() {
                    @Override
                    public MapLayerData load(TiledJsonTileMap tiledMap) throws Exception {
                        return loadMapInternally(tiledMap);
                    }
                });
    }

    @Override
    public MapLayerData loadMap(TiledJsonTileMap tiledJsonTileMap) throws ExecutionException {
        return mapCache.get(tiledJsonTileMap);

    }


    private MapLayerData loadMapInternally(TiledJsonTileMap tiledJsonTileMap){
        mapContext.setCurrentMapData(tiledJsonTileMapMapContextDataConverter.convert(tiledJsonTileMap));
        LoadedTileData loadedTileData = tileLoadingService.loadTilesForMap(tiledJsonTileMap);
        Map<String, List<ImageView>> integerImageViewMap = new LinkedHashMap<>();
        tiledJsonTileMap.getTileMapLayers().stream().filter(tileMapLayer -> tileMapLayer.isVisible()).forEach(tileMapLayer -> {
            if(tileMapLayer.getLayerName().equalsIgnoreCase(PLAYER_LAYER_NAME)){
                integerImageViewMap.put(tileMapLayer.getLayerName(),null);
            }else{
                List<ImageView> mapLayer = loadMapParts(tiledJsonTileMap, tileMapLayer, loadedTileData);
                integerImageViewMap.put(tileMapLayer.getLayerName(),mapLayer);
            }
        });
        return new MapLayerData(integerImageViewMap);
    }


    private List<ImageView> loadMapParts(TiledJsonTileMap tiledJsonTileMap, TileMapLayer tileMapLayer, LoadedTileData loadedTileData) {
        List<ImageView> layerMap = new ArrayList<>();
        for (int y = 0; y < tileMapLayer.getHeight(); y++) {
            for (int x = 0; x < tileMapLayer.getWidth(); x++) {

                int rowToTake = y == 1 ? 0 + x  : y*tileMapLayer.getWidth()+x;
                int imageToPlace = tileMapLayer.getData()[rowToTake]-1;

                if(imageToPlace>=0){
                    int widthX = x * tiledJsonTileMap.getTileWidth();
                    int widthY = y *tiledJsonTileMap.getTileHeight();
                    ImageView imageView =loadedTileData.getTileDataList().get(imageToPlace).buildImageView();

                    imageView.setLayoutX(widthX);
                    imageView.setLayoutY(widthY);
                    layerMap.add(imageView);
                }
            }
        }
        return layerMap;
    }






}
