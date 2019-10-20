package com.mca.mastermind.controllers;

import com.mca.mastermind.models.Session;
import com.mca.mastermind.views.console.ResumeView;

public class ResumeController extends Controller {

    public ResumeController(Session session) {
        super(session);
    }

    private void resume(boolean newGame) {
        if (newGame) {
            this.session.clearGame();
        } else {
            this.session.next();
        }
    }

    public void clearGame() {
        this.session.clearGame();
    }

    @Override
    public void control() {
        this.resume(new ResumeView().write());
    }
}
