package com.mca.mastermind.views;

import java.util.List;
import com.mca.mastermind.controllers.ProposeCombinationController;
import com.mca.mastermind.models.Color;
import com.mca.mastermind.utils.MastermindErrors;
import com.mca.mastermind.utils.MastermindIO;
import com.mca.mastermind.utils.MastermindMessages;
import com.mca.mastermind.views.console.AttemptsView;
import com.mca.mastermind.views.console.ProposedCombinationView;
import com.mca.mastermind.views.console.ResultView;

public class ProposeCombinationView {

    public void interact(
            ProposeCombinationController proposeCombinationController) {
        MastermindErrors mastermindErrors = null;
        do {
            write(0);
            List<Color> colors = MastermindIO.readCombination();
            mastermindErrors = proposeCombinationController
                    .addProposedCombination(colors);
            if (mastermindErrors != null) {
                MastermindIO.writeln(mastermindErrors);
            }
        } while (mastermindErrors != null);
        new AttemptsView(proposeCombinationController).writeln();
        MastermindIO.writeln(MastermindMessages.ASTERISK);
        for (int i = 0; i < proposeCombinationController.getAttempts(); i++) {
            new ProposedCombinationView(proposeCombinationController).write(i);
            new ResultView(proposeCombinationController).writeln(i);
        }
        if (proposeCombinationController.isWinner()) {
            MastermindIO.write(MastermindMessages.WINNER);
        } else if (proposeCombinationController.isLooser()) {
            MastermindIO.write(MastermindMessages.LOSSER);
        }
    }

    public void write(int position) {
        MastermindIO.writeln(MastermindMessages.PROPOSE_COMBINATION);
    }
}
