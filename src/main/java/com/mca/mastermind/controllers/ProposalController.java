package com.mca.mastermind.controllers;

import java.util.List;
import com.mca.mastermind.models.Combination;
import com.mca.mastermind.models.Session;
import com.mca.mastermind.types.Color;
import com.mca.mastermind.types.Error;
import com.mca.mastermind.views.ErrorView;
import com.mca.mastermind.views.MessageView;
import com.mca.mastermind.views.console.GameView;
import com.mca.mastermind.views.console.ProposedCombinationView;

public class ProposalController extends Controller {

    private ProposedCombinationView proposedCombinationView;

    public ProposalController(Session session) {
        super(session);
        this.proposedCombinationView = new ProposedCombinationView();
    }

    public Error addProposedCombination(List<Color> colors) {
        Error error = null;
        if (colors.size() != Combination.getWidth()) {
            error = Error.WRONG_LENGTH;
        } else {
            for (int i = 0; i < colors.size(); i++) {
                if (colors.get(i) == null) {
                    error = Error.WRONG_CHARACTERS;
                } else {
                    for (int j = i + 1; j < colors.size(); j++) {
                        if (colors.get(i) == colors.get(j)) {
                            error = Error.DUPLICATED;
                        }
                    }
                }
            }
        }
        if (error == null) {
            this.session.addProposedCombination(colors);
        }
        return error;
    }

    public boolean isWinner() {
        return this.session.isWinner();
    }

    public boolean isLooser() {
        return this.session.isLooser();
    }

    public int getAttempts() {
        return this.session.getAttempts();
    }

    public List<Color> getColors(int position) {
        return this.session.getColors(position);
    }

    public int getBlacks(int position) {
        return this.session.getBlacks(position);
    }

    public int getWhites(int position) {
        return this.session.getWhites(position);
    }

    @Override
    public void control() {
        Error error;
        do {
            List<Color> colors = this.proposedCombinationView.read();
            error = this.addProposedCombination(colors);
            if (error != null) {
                new ErrorView(error).writeln();
            }
        } while (error != null);
        MessageView.NEW_LINE.writeln();
        new GameView().writeGame(this.session);
        this.isFinished();
    }

    private void isFinished() {
        if (this.session.isWinner()) {
            MessageView.WINNER.writeln();
            this.session.next();
        } else if (this.session.isLooser()) {
            MessageView.LOOSER.writeln();
            this.session.next();
        }
    }
}
