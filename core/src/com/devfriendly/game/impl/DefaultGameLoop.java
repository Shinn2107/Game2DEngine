package com.devfriendly.game.impl;


import com.devfriendly.game.GameLoop;
import com.devfriendly.system.rendering.GameRenderer;
import com.devfriendly.system.updating.GameUpdateHandler;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.ParallelTransition;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.util.Duration;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Patrick Fey on 15.01.2016.
 */
public class DefaultGameLoop implements GameLoop {
    private static final Logger LOG = Logger.getLogger(DefaultGameLoop.class);

    @Autowired
    GameUpdateHandler gameUpdateHandler;

    @Autowired
    GameRenderer gameRenderer;

    private ParallelTransition parallelTransition;

    private final long[] frameTimes = new long[100];
    private int frameTimeIndex = 0 ;
    private boolean arrayFilled = false ;



    @Override
    public void start() {
        Timeline renderingTimeLine = createRenderingTimeLine();
        Timeline updatingTimeLine = createUpdatingTimeLine();
        parallelTransition = new ParallelTransition(renderingTimeLine,updatingTimeLine);
        parallelTransition.play();
    }

    private Timeline createUpdatingTimeLine() {
        Timeline timeline = createTimeLine();
        final Duration oneUpdateAmt = Duration.millis(1000 / 60);
        timeline.getKeyFrames().add(new KeyFrame(oneUpdateAmt, event -> gameUpdateHandler.update()));
        return timeline;
    }

    private Timeline createRenderingTimeLine() {
        Timeline timeline = createTimeLine();
        final Duration oneFrameAmt = Duration.millis(1000 / 100);
        timeline.getKeyFrames().add(new KeyFrame(oneFrameAmt, event -> {
            calculateFrames();
            gameRenderer.render();
        }));
        return timeline;
    }

    private void calculateFrames() {
        long now = System.nanoTime();
        long oldFrameTime = frameTimes[frameTimeIndex] ;
        frameTimes[frameTimeIndex] = now;
        frameTimeIndex = (frameTimeIndex + 1) % frameTimes.length ;
        if (frameTimeIndex == 0) {
            arrayFilled = true ;
        }
        if (arrayFilled) {
            long elapsedNanos = now - oldFrameTime ;
            long elapsedNanosPerFrame = elapsedNanos / frameTimes.length ;
            double frameRate = 1_000_000_000.0 / elapsedNanosPerFrame ;
            LOG.info(String.format("Current frame rate: %.3f", frameRate));
        }
    }

    private Timeline createTimeLine() {
        Timeline timeline = new Timeline();
        timeline.setCycleCount(Animation.INDEFINITE);
        return timeline;
    }


    @Override
    public void stop() {

        parallelTransition.stop();
    }




}
