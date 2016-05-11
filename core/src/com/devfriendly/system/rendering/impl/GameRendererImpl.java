package com.devfriendly.system.rendering.impl;


import com.devfriendly.game.impl.GameScreen;
import com.devfriendly.system.exception.GameStateNotSetException;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.WritableImage;
import org.springframework.beans.factory.annotation.Autowired;

import com.devfriendly.game.GameWindow;
import com.devfriendly.system.GameStateManager;
import com.devfriendly.system.rendering.GameRenderer;

/**
 * Created by Patrick Fey on 17.01.2016.
 */
public class GameRendererImpl implements GameRenderer {
    @Autowired
    GameWindow gameWindow;

    @Autowired
    GameStateManager gameStateManager;

    @Override
    public void render() {
        final Group rootGroup = new Group();
        renderInternal(rootGroup);
        gameWindow.getRootPane().getChildren().clear();
        gameWindow.getRootPane().getChildren().add(rootGroup);
    }

    private void renderInternal(Group rootGroup) {
        try {
            gameStateManager.getCurrentGameState().getInteractables()
                    .forEach(item -> item.render(rootGroup));
            gameStateManager.getCurrentGameState().getInteractables()
                    .forEach(item -> item.clear());
        } catch (GameStateNotSetException e) {
            e.printStackTrace();
        }
    }

}
