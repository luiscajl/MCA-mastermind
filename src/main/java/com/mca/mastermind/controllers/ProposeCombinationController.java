package com.mca.mastermind.controllers;

import java.util.List;
import com.mca.mastermind.models.Color;
import com.mca.mastermind.models.Combination;
import com.mca.mastermind.models.Game;
import com.mca.mastermind.models.State;
import com.mca.mastermind.utils.MastermindErrors;

public class ProposeCombinationController extends Controller {

    public ProposeCombinationController(Game game, State state) {
        super(game, state);
    }

    public MastermindErrors addProposedCombination(List<Color> colors) {
        MastermindErrors error = null;
        if (colors.size() != Combination.getWidth()) {
            error = MastermindErrors.WRONG_LENGTH;
        } else {
            for (int i = 0; i < colors.size(); i++) {
                if (colors.get(i) == null) {
                    error = MastermindErrors.WRONG_CHARACTERS;
                } else {
                    for (int j = i + 1; j < colors.size(); j++) {
                        if (colors.get(i) == colors.get(j)) {
                            error = MastermindErrors.REPEATED_COLORS;
                        }
                    }
                }
            }
        }
        if (error == null) {
            this.game.addProposedCombination(colors);
            if (this.game.isWinner() || this.game.isLooser()) {
                this.state.next();
            }
        }
        return error;
    }

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }

    public boolean isWinner() {
        return game.isWinner();
    }

    public boolean isLooser() {
        return game.isLooser();
    }

    public int getAttempts() {
        return game.getAttempts();
    }

    public List<Color> getColors(int position) {
        return game.getColors(position);
    }

    public int getDeaths(int position) {
        return game.getDeaths(position);
    }

    public int getDamaged(int position) {
        return game.getDamaged(position);
    }
}
