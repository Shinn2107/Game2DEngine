package com.devfriendly.input.button.action;

import com.devfriendly.input.button.ButtonAction;
import org.springframework.stereotype.Component;

/**
 * Created by Shinn on 18.04.2016.
 */
@Component
public class ExitApplicationAction implements ButtonAction {


    @Override
    public void performAction() {

        System.exit(0);
    }
}
