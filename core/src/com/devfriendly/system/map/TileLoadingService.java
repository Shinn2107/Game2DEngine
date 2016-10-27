package com.devfriendly.system.map;

import com.devfriendly.assets.map.impl.TiledJsonTileMap;
import com.devfriendly.system.map.data.LoadedTileData;

/**
 * Created by Shinn on 27.10.2016.
 */
public interface TileLoadingService {

    LoadedTileData loadTilesForMap(TiledJsonTileMap tiledJsonTileMap);
}
