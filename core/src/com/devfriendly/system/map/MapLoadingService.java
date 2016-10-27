package com.devfriendly.system.map;

import com.devfriendly.assets.map.impl.TiledJsonTileMap;
import com.devfriendly.system.map.data.MapLayerData;

import java.util.concurrent.ExecutionException;

/**
 * Created by Shinn on 27.10.2016.
 */
public interface MapLoadingService {



    MapLayerData loadMap(TiledJsonTileMap tileMapLayer) throws ExecutionException;

}
