package com.mca.mastermind.views.console;

import com.mca.mastermind.controllers.ProposeCombinationController;
import com.mca.mastermind.utils.MastermindIO;
import com.mca.mastermind.utils.MastermindMessages;

public class ResultView {

    private ProposeCombinationController proposeCombinationController;

    public ResultView(
            ProposeCombinationController proposeCombinationController) {
        this.proposeCombinationController = proposeCombinationController;
    }

    public void writeln(int i) {
        MastermindIO.writeln(MastermindMessages.DEATHS.getMessage()
                + proposeCombinationController.getDeaths(i)
                + MastermindMessages.DAMAGED.getMessage()
                + proposeCombinationController.getDamaged(i));
    }
}
