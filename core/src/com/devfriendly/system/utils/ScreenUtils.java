package com.devfriendly.system.utils;

import com.devfriendly.input.button.AbstractButton;

import java.awt.*;

/**
 * Created by Shinn on 13.04.2016.
 */
public class ScreenUtils {


    public static int findScreenCenter(int totalWidth){
        return totalWidth/2;
    }

    public static int addLineSpacing(int position, int spacing){
        return position + spacing;
    }


    public static void addButton(Graphics g, final AbstractButton button,int x, int y){

        g.setColor(new Color(button.getR(),button.getG(),button.getB()));
        g.setFont(new Font(button.getFont(),button.getFontWeight(),button.getFontSize()));
        g.drawString(button.getText(),x,y);
    }
}
