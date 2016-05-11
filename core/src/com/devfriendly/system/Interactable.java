package com.devfriendly.system;

import javafx.scene.Group;
import javafx.scene.canvas.GraphicsContext;

import java.awt.*;

/**
 * Created by Patrick Fey on 02.02.2016.
 */
public interface Interactable {




    void render(Group g);

    void update();

    void clear();
}
