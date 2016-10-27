package com.devfriendly.system.camera.impl;

import com.devfriendly.game.GameWindow;
import com.devfriendly.system.camera.Camera;
import com.devfriendly.system.map.MapContext;
import com.devfriendly.system.mob.impl.HumanPlayer;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Shinn on 25.10.2016.
 */
public class GameCameraImpl implements Camera {

    private Logger LOG = Logger.getLogger(GameCameraImpl.class);

    @Autowired
    GameWindow gameWindow;

    @Autowired
    MapContext mapContext;

    @Override
    public void centerOnPlayer(HumanPlayer humanPlayer) {
        gameWindow.getPrimaryStage().getScene().getCamera().setTranslateX(humanPlayer.getxCoordinate() - mapContext.getCurrentMapData().getTotalWidth() / 2 - humanPlayer.getWidth() / 2);
        gameWindow.getPrimaryStage().getScene().getCamera().setTranslateY(humanPlayer.getyCoordinate() - mapContext.getCurrentMapData().getTotalHeight() / 2 -humanPlayer.getHeight() / 2);
    }

}
