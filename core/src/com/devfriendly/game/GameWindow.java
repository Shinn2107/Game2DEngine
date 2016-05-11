package com.devfriendly.game;

import javax.annotation.Resource;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

import com.devfriendly.game.impl.DefaultGameLoop;
import com.devfriendly.game.impl.GameScreen;
import com.devfriendly.input.Keyboard;
import com.devfriendly.system.rendering.GameRenderer;
import com.devfriendly.system.updating.GameUpdateHandler;
import com.sun.org.apache.xpath.internal.SourceTree;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;

import com.devfriendly.application.ApplicationConfig;
import com.devfriendly.game.exception.GameAlreadyStartedException;

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
        rootPane = new StackPane();
        //stackPane.getChildren().add(gameScreen);
        Scene scene = new Scene(rootPane, getApplicationConfig().getWidth(), getApplicationConfig().getHeight());

        scene.setOnKeyPressed(getKeyboard().getListener());
        scene.setOnKeyReleased(getKeyboard().getListener());

        primaryStage.setTitle(getApplicationConfig().getGameTitle());
        primaryStage.setResizable(getApplicationConfig().isResizeable());
        primaryStage.setScene(scene);
        primaryStage.centerOnScreen();
        primaryStage.show();
        primaryStage.requestFocus();
        setPrimaryStage(primaryStage);
        gameLoop.start();
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
