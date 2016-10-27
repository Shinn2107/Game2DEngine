package com.devfriendly.game;

import javax.annotation.Resource;

import javafx.geometry.Insets;
import javafx.scene.Camera;
import javafx.scene.ParallelCamera;
import javafx.scene.PerspectiveCamera;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import org.springframework.beans.factory.annotation.Autowired;

import com.devfriendly.application.ApplicationConfig;
import com.devfriendly.game.impl.GameScreen;
import com.devfriendly.input.Keyboard;

import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by Patrick Fey on 16.01.2016.
 */
public class GameWindow {
    @Resource(name = "applicationConfig")
    private ApplicationConfig applicationConfig;

    @Resource(name = "gameLoop")
    private GameLoop gameLoop;

    @Resource(name = "keyboard")
    private Keyboard keyboard;

    @Autowired
    private GameScreen gameScreen;
    private Stage primaryStage;

    private Pane rootPane;

    public void startGame(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        rootPane = new StackPane();
        Scene scene = new Scene(rootPane, getApplicationConfig().getWidth(), getApplicationConfig().getHeight());
        scene.setOnKeyPressed(getKeyboard().getListener());
        scene.setOnKeyReleased(getKeyboard().getListener());

        Camera camera = new PerspectiveCamera();
        camera.setNearClip(0.1);
        camera.setFarClip(2000.0);
        scene.setCamera(camera);
        scene.setFill(Color.BLACK);
        primaryStageSetup(scene);
        gameLoop.start();
    }

    private void primaryStageSetup(Scene scene) {
        primaryStage.setTitle(getApplicationConfig().getGameTitle());
        primaryStage.setResizable(getApplicationConfig().isResizeable());
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.requestFocus();
        setPrimaryStage(primaryStage);
    }

    public Pane getRootPane() {
        return rootPane;
    }

    public void setApplicationConfig(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
    }



    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public ApplicationConfig getApplicationConfig() {
        return applicationConfig;
    }



    public GameScreen getGameScreen() {
        return gameScreen;
    }

    public void setGameScreen(GameScreen gameScreen) {
        this.gameScreen = gameScreen;
    }

    public GameLoop getGameLoop() {
        return gameLoop;
    }

    public void setGameLoop(GameLoop gameLoop) {
        this.gameLoop = gameLoop;
    }

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

}
