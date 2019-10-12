package com.mca.mastermind.views.console;

import com.mca.mastermind.controllers.ProposalController;
import com.mca.mastermind.views.MessageView;
import com.mca.santaTecla.utils.WithConsoleView;

public class AttemptsView extends WithConsoleView {

    private ProposalController proposalController;

    AttemptsView(ProposalController proposalController) {
        this.proposalController = proposalController;
    }

    void writeln() {
        this.console.writeln(MessageView.ATTEMPTS.getMessage().replaceFirst(
                "#attempts", "" + this.proposalController.getAttempts()));
    }
}
