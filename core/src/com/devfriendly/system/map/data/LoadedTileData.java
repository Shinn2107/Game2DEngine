package com.devfriendly.system.map.data;

import com.devfriendly.assets.tileset.TileData;

import java.util.List;

/**
 * Created by Shinn on 27.10.2016.
 */
public class LoadedTileData {

    private List<TileData> tileDataList;

    public LoadedTileData(List<TileData> tileDataList) {
        this.tileDataList = tileDataList;
    }

    public List<TileData> getTileDataList() {
        return tileDataList;
    }
}
