package com.mca.mastermind;

import com.mca.mastermind.controllers.Controller;
import com.mca.mastermind.controllers.Logic;
import com.mca.mastermind.views.View;
import com.mca.mastermind.views.console.ConsoleView;

/**
 * Main Class
 * 
 * @author luisca
 *
 */
public class Mastermind {

    private Logic logic;

    private View view;

    private Mastermind() {
        this.logic = new Logic();
        this.view = new ConsoleView();
    }

    public static void main(String[] args) {
        new Mastermind().play();
    }

    public void play() {
        Controller controller;
        do {
            controller = logic.getController();
            view.interact(controller);
        } while (controller != null);
    }
}
