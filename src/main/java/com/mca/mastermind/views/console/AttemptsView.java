package com.mca.mastermind.views.console;

import com.mca.mastermind.controllers.ProposeCombinationController;
import com.mca.mastermind.utils.MastermindIO;
import com.mca.mastermind.utils.MastermindMessages;

public class AttemptsView {

    private ProposeCombinationController proposeCombinationController;

    public AttemptsView(
            ProposeCombinationController proposeCombinationController) {
        this.proposeCombinationController = proposeCombinationController;
    }

    public void writeln() {
        MastermindIO.writeln(this.proposeCombinationController.getAttempts()
                + MastermindMessages.ATTEMPTS.getMessage());
    }
}
