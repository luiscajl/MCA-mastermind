package com.mca.mastermind;

import com.mca.mastermind.controllers.GameController;
import com.mca.mastermind.controllers.Logic;
import com.mca.mastermind.views.View;

public abstract class Mastermind {

    private Logic logic;

    private View view;

    protected Mastermind() {
        this.logic = this.createLogic();
        this.view = new View();
    }

    protected abstract Logic createLogic();

    protected void play() {
        GameController acceptorController;
        do {
            acceptorController = this.logic.getController();
            if (acceptorController != null) {
                this.view.interact(acceptorController);
            }
        } while (acceptorController != null);
    }
}
