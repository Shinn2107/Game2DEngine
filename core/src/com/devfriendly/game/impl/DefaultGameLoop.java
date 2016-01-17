package com.devfriendly.game.impl;


import org.apache.log4j.Logger;

import com.devfriendly.game.GameLoop;

/**
 * Created by Patrick Fey on 15.01.2016.
 */
public class DefaultGameLoop implements GameLoop {
    private static final Logger LOG = Logger.getLogger(DefaultGameLoop.class);

    private Thread gameThread;
    private boolean running;

    @Override
    public synchronized void run() {
        long lastTime = System.nanoTime();
        final double ns = 1000000000.0 / 60.0;
        double delta = 0;
        int frames = 0;
        int updates = 0;
        long timer = System.currentTimeMillis();
        while (running) {
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            while (delta >= 1){
                /*update();*/
                updates++;
                delta--;
            }
            /*render();*/
            frames++;

            if(System.currentTimeMillis() - timer > 1000){
                timer += 1000;
                if(LOG.isDebugEnabled()){
                    LOG.debug("[ "+updates + " ups, "+ frames +" fps ]");
                }
                frames = 0;
                updates = 0;
            }
        }
    }

    @Override
    public synchronized void start() {
        running = true;
        gameThread = new Thread(this, "Game Thread");
        gameThread.start();
    }

    @Override
    public synchronized void stop() {
        running = false;
        try {
            gameThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
