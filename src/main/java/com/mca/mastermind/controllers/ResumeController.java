package com.mca.mastermind.controllers;

import com.mca.mastermind.models.Game;
import com.mca.mastermind.models.State;

public class ResumeController extends Controller {

    public ResumeController(Game game, State state) {
        super(game, state);
    }

    public void resume(boolean newGame) {
        if (newGame) {
            this.game.clear();
            this.state.reset();
        } else {
            this.state.next();
        }
    }

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }
}
