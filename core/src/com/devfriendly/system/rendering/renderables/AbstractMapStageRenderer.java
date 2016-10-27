package com.devfriendly.system.rendering.renderables;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Shinn on 11.05.2016.
 */
public abstract class AbstractMapStageRenderer extends AbstractStageRenderer {

    private String mapUrl;


    public AbstractMapStageRenderer(String mapUrl) {
        this.mapUrl = mapUrl;
    }



}
