package com.devfriendly.game.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.devfriendly.game.GameWindow;
import com.devfriendly.game.exception.GameAlreadyStartedException;

/**
 * Created by Patrick Fey on 16.01.2016.
 */
public class EasyGameWindow extends GameWindow {

    @Autowired
    private GameScreen gameFrame;

    @Override
    public void startGame() throws GameAlreadyStartedException {
        gameFrame.add(this);
        gameFrame.pack();
        gameFrame.setVisible(true);

        getGameLoop().start();
    }


    public GameScreen getGameFrame() {
        return gameFrame;
    }

    public void setGameFrame(GameScreen gameFrame) {
        this.gameFrame = gameFrame;
    }

   /* @Override
    public void render() {
        BufferStrategy bs = this.getBufferStrategy();
        if(bs == null){
            this.createBufferStrategy(3);
            return;
        }
        setForeground(Color.WHITE);
        setBackground(Color.PINK);
        setFont(new Font("Arial", Font.PLAIN, 24));
        Graphics g = bs.getDrawGraphics();
        g.drawString("Test Render",100,100);
        *//*g.drawImage(image,0,0,getWidth(),getHeight(),null);*//*
        g.dispose();
        bs.show();
    }

    @Override
    public void clear() {
        *//*for (int i=0; i < pixels.length; i++) {
            pixels[i] = 0;
        }*//*
    }*/
}
