package com.mca.mastermind.views.console;

import com.mca.mastermind.models.Session;
import com.mca.mastermind.types.Color;

public class GameView {

    public GameView() {
    }

    public void writeGame(Session session) {
        new AttemptsView().writeln(session.getAttempts());
        new SecretCombinationView().writeln(session.getWidth());
        for (int i = 0; i < session.getAttempts(); i++) {
            this.writeColors(i, session);
        }
    }

    private void writeColors(int position, Session session) {
        for (Color color : session.getColors(position)) {
            new ColorView(color).write();
        }
        new ResultView().writeln(session.getBlacks(position),
                session.getWhites(position));
    }
}