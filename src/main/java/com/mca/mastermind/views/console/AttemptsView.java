package com.mca.mastermind.views.console;

import com.mca.mastermind.controllers.PlayController;
import com.mca.mastermind.views.MessageView;

public class AttemptsView {

    private PlayController playController;

    public AttemptsView(PlayController playController) {
        this.playController = playController;
    }

    public void writeln() {
        MessageView.ATTEMPTS.writeln(this.playController.getAttempts());
    }
}
