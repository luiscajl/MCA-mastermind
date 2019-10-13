package com.mca.mastermind.views;

import com.mca.mastermind.controllers.PlayController;

public class GameView {

    public GameView(PlayController playController) {
        MessageView.NEW_LINE.writeln();
        new AttemptsView(playController).writeln();
        new SecretCombinationView(playController).writeln();
        for (int i = 0; i < playController.getAttempts(); i++) {
            new ProposedCombinationView(playController).write(i);
            new ResultView(playController).writeln(i);
        }
        if (playController.isWinner()) {
            MessageView.WINNER.writeln();
        } else if (playController.isLooser()) {
            MessageView.LOOSER.writeln();
        }
    }
}
