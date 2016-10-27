package com.devfriendly.system.map.impl;

import com.devfriendly.assets.map.impl.TiledJsonTileMap;
import com.devfriendly.assets.tileset.TileData;
import com.devfriendly.assets.tileset.TileSet;
import com.devfriendly.system.map.TileLoadingService;
import com.devfriendly.system.map.data.LoadedTileData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shinn on 27.10.2016.
 */
public class TileLoadingServiceImpl implements TileLoadingService {


    @Override
    public LoadedTileData loadTilesForMap(TiledJsonTileMap tiledJsonTileMap) {
        List<TileData> tileDataList = new ArrayList<>();
        tiledJsonTileMap.getTileSetList().stream().forEach(tileSet -> tileDataList.addAll(tileSet.getTileImages()));
        final LoadedTileData loadedTileData = new LoadedTileData(tileDataList);
        return loadedTileData;
    }

}
