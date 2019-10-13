package com.mca.mastermind.controllers;

import com.mca.mastermind.models.Session;

public class ResumeController extends GameController {

    public ResumeController(Session session) {
        super(session);
    }

    public void resume(boolean newGame) {
        if (newGame) {
            this.session.clearGame();
        } else {
            this.session.next();
        }
    }

    @Override
    public void accept(ControllersVisitor controllersVisitor) {
        controllersVisitor.visit(this);
    }
}
