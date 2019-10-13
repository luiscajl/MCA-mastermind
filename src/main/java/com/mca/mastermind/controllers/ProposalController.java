package com.mca.mastermind.controllers;

import java.util.List;
import com.mca.mastermind.models.Color;
import com.mca.mastermind.models.Combination;
import com.mca.mastermind.models.MastermindError;
import com.mca.mastermind.models.Session;

public class ProposalController extends Controller {

    public ProposalController(Session session) {
        super(session);
    }

    public MastermindError addProposedCombination(List<Color> colors) {
        MastermindError error = null;
        if (colors.size() != Combination.getWidth()) {
            error = MastermindError.WRONG_LENGTH;
        } else {
            for (int i = 0; i < colors.size(); i++) {
                if (colors.get(i) == null) {
                    error = MastermindError.WRONG_CHARACTERS;
                } else {
                    for (int j = i + 1; j < colors.size(); j++) {
                        if (colors.get(i) == colors.get(j)) {
                            error = MastermindError.DUPLICATED;
                        }
                    }
                }
            }
        }
        if (error == null) {
            this.session.addProposedCombination(colors);
            if (this.session.isWinner() || this.session.isLooser()) {
                this.session.next();
            }
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
}
