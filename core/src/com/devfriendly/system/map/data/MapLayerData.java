package com.devfriendly.system.map.data;

import javafx.scene.image.ImageView;

import java.util.List;
import java.util.Map;

/**
 * Created by Shinn on 27.10.2016.
 */
public class MapLayerData {

    private Map<String, List<ImageView>> layeredMapData;

    public MapLayerData(Map<String, List<ImageView>> layeredMapData) {
        this.layeredMapData = layeredMapData;
    }

    public Map<String, List<ImageView>> getLayeredMapData() {
        return layeredMapData;
    }
}
