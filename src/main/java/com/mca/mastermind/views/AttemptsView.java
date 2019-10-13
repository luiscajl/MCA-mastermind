package com.mca.mastermind.views;

import com.mca.mastermind.controllers.PlayController;

public class AttemptsView {

    private PlayController playController;

    AttemptsView(PlayController proposalController) {
        this.playController = proposalController;
    }

    void writeln() {
        MessageView.ATTEMPTS.writeln(this.playController.getAttempts());
    }
}
