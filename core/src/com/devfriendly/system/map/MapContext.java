package com.devfriendly.system.map;

import com.devfriendly.system.map.data.MapContextData;

/**
 * Created by Shinn on 27.10.2016.
 */
public interface MapContext {


    void setCurrentMapData(MapContextData mapData);

    MapContextData getCurrentMapData();
}
