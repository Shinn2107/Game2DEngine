package com.devfriendly.system.utils;

import com.devfriendly.input.button.AbstractButton;
import javafx.scene.Group;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.scene.text.Font;

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



    public static void addButton(Group g, final AbstractButton button,int x, int y){
        Text text = new Text();
        text.setLayoutX(x);
        text.setLayoutY(y);
        text.setFont(javafx.scene.text.Font.font(20));
        text.setFill(Color.rgb(button.getR(),button.getG(),button.getB()));
        text.setText(button.getText());
        g.getChildren().add(text);


    }
}
