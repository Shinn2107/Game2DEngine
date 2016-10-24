package com.devfriendly.game;

import java.util.Arrays;

import com.devfriendly.application.ApplicationContextLoader;
import com.devfriendly.application.impl.ApplicationContextLoaderImpl;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Created by Patrick Fey on 15.01.2016.
 */
public class Game extends Application{

    private static ApplicationContextLoader applicationContextLoader;
    private static GameWindow gameWindow;

    public static void main(String[] args) throws Exception {

        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        if(applicationContextLoader==null){
            applicationContextLoader = new ApplicationContextLoaderImpl(Arrays.asList("game-application-context.xml"));
        }

        gameWindow = (GameWindow) applicationContextLoader.getContext().getBean("gameWindow");
        gameWindow.startGame(primaryStage);
    }
}
