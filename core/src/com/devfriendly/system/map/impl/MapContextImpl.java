package com.devfriendly.system.map.impl;

import com.devfriendly.system.map.MapContext;
import com.devfriendly.system.map.data.MapContextData;

/**
 * Created by Shinn on 27.10.2016.
 */
public class MapContextImpl implements MapContext {
    private static MapContextData currentMapData;

    @Override
    public void setCurrentMapData(MapContextData mapData) {
        currentMapData = mapData;
    }

    @Override
    public MapContextData getCurrentMapData() {
        return currentMapData;
    }
}
