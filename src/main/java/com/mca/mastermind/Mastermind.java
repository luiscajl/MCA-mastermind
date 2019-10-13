package com.mca.mastermind;

import com.mca.mastermind.controllers.GameController;
import com.mca.mastermind.controllers.Logic;
import com.mca.mastermind.views.View;

public class Mastermind {

    private Logic logic;

    private View view;

    public static void main(String[] args) {
        new Mastermind().play();
    }

    /**
     * Private constructor
     * 
     * @param view
     *            the selected view
     */
    protected Mastermind() {
        this.logic = new Logic();
        this.view = new View();
    }

    protected void play() {
        GameController gameController;
        do {
            gameController = this.logic.getController();
            if (gameController != null) {
                this.view.interact(gameController);
            }
        } while (gameController != null);
    }
}
