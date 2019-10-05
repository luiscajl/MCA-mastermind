package com.mca.mastermind.controllers;

import com.mca.mastermind.models.Game;
import com.mca.mastermind.models.State;

public abstract class Controller {

    protected Game game;

    protected State state;

    public Controller(Game game, State state) {
        this.game = game;
        this.state = state;
    }

    public abstract void accept(ControllerVisitor controllerVisitor);
}