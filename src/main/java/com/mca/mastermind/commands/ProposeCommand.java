package com.mca.mastermind.commands;

import java.util.List;
import com.mca.mastermind.controllers.PlayController;
import com.mca.mastermind.models.Color;
import com.mca.mastermind.models.MastermindError;
import com.mca.mastermind.views.ErrorView;
import com.mca.mastermind.views.GameView;
import com.mca.mastermind.views.MessageView;
import com.mca.mastermind.views.ProposedCombinationView;

public class ProposeCommand extends PlayCommand {

    public ProposeCommand(PlayController playController) {
        super(MessageView.PROPOSE_COMMAND.getMessage(), 1, playController);
    }

    @Override
    public void execute() {
        MastermindError error;
        do {
            List<Color> colors = new ProposedCombinationView(
                    this.playController).read();
            error = this.playController.addProposedCombination(colors);
            if (error != null) {
                new ErrorView(error).writeln();
            }
        } while (error != null);
        new GameView(this.playController);
    }

    @Override
    public boolean isActive() {
        return true;
    }
}
