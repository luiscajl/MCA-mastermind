package com.mca.mastermind.views.console;

import com.mca.mastermind.controllers.ProposalController;
import com.mca.mastermind.views.MessageView;
import com.mca.santaTecla.utils.WithConsoleView;

class ResultView extends WithConsoleView {

    private ProposalController proposalController;

    ResultView(ProposalController proposalController) {
        this.proposalController = proposalController;
    }

    void writeln(int i) {
        this.console.writeln(MessageView.RESULT.getMessage()
                .replaceFirst("#blacks",
                        "" + this.proposalController.getBlacks(i))
                .replaceFirst("#whites",
                        "" + this.proposalController.getWhites(i)));
    }
}
