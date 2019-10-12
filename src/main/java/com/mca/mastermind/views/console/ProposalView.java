package com.mca.mastermind.views.console;

import java.util.List;
import com.mca.mastermind.controllers.ProposalController;
import com.mca.mastermind.types.Color;
import com.mca.mastermind.types.Error;
import com.mca.mastermind.views.MessageView;
import com.mca.santaTecla.utils.WithConsoleView;

class ProposalView extends WithConsoleView {

    void interact(ProposalController proposalController) {
        Error error;
        do {
            List<Color> colors = new ProposedCombinationView(proposalController)
                    .read();
            error = proposalController.addProposedCombination(colors);
            if (error != null) {
                new ErrorView(error).writeln();
            }
        } while (error != null);
        this.console.writeln();
        new AttemptsView(proposalController).writeln();
        new SecretCombinationView(proposalController).writeln();
        for (int i = 0; i < proposalController.getAttempts(); i++) {
            new ProposedCombinationView(proposalController).write(i);
            new ResultView(proposalController).writeln(i);
        }
        if (proposalController.isWinner()) {
            this.console.writeln(MessageView.WINNER.getMessage());
        } else if (proposalController.isLooser()) {
            this.console.writeln(MessageView.LOOSER.getMessage());
        }
    }
}
