package com.mca.mastermind.views.console;

import com.mca.mastermind.controllers.ProposeCombinationController;
import com.mca.mastermind.models.Color;
import com.mca.mastermind.utils.MastermindIO;
import com.mca.mastermind.utils.MastermindMessages;

public class ProposedCombinationView {

    private ProposeCombinationController proposeCombinationController;

    public ProposedCombinationView(
            ProposeCombinationController proposeCombinationController) {
        this.proposeCombinationController = proposeCombinationController;
    }

    public void write(int position) {
        for (Color color : proposeCombinationController.getColors(position)) {
            MastermindIO.write(color.getColor());
        }
        MastermindIO.write(MastermindMessages.ARROW);
    }
}
