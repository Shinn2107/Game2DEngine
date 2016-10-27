package com.devfriendly.system.map.converter;

import com.devfriendly.assets.map.impl.TiledJsonTileMap;
import com.devfriendly.system.converter.Converter;
import com.devfriendly.system.map.data.MapContextData;
import org.springframework.stereotype.Component;

/**
 * Created by Shinn on 27.10.2016.
 */
@Component
public class TiledMapDataToMapContextDataConverter implements Converter<TiledJsonTileMap, MapContextData> {


    @Override
    public MapContextData convert(TiledJsonTileMap tiledJsonTileMap) {
        final MapContextData mapContextData = new MapContextData();
        mapContextData.setHeight(tiledJsonTileMap.getHeight());
        mapContextData.setWidth(tiledJsonTileMap.getWidth());
        mapContextData.setTileWidth(tiledJsonTileMap.getTileWidth());
        mapContextData.setTileHeight(tiledJsonTileMap.getTileHeight());
        mapContextData.setTotalWidth(tiledJsonTileMap.getWidth()*tiledJsonTileMap.getTileWidth());
        mapContextData.setTotalHeight(tiledJsonTileMap.getHeight() * tiledJsonTileMap.getTileHeight());
        return mapContextData;
    }
}
