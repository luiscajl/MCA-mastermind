package com.mca.mastermind.views.menus;

import java.util.List;
import com.mca.mastermind.controllers.PlayController;
import com.mca.mastermind.types.Color;
import com.mca.mastermind.types.Error;
import com.mca.mastermind.views.models.ErrorView;
import com.mca.mastermind.views.models.GameView;
import com.mca.mastermind.views.models.MessageView;
import com.mca.mastermind.views.models.ProposedCombinationView;

class ProposeCommand extends Command {

	ProposeCommand(PlayController playController) {
		super(MessageView.PROPOSE_COMMAND.getMessage(), playController);
	}

	@Override
	protected void execute() {
		Error error;
		do {
			List<Color> colors = new ProposedCombinationView((PlayController)this.acceptorController).read();
			error = ((PlayController)this.acceptorController).addProposedCombination(colors);
			if (error != null) {
				new ErrorView(error).writeln();
			}
		} while (error != null);
		new GameView((PlayController)this.acceptorController);
	}

	@Override
	protected boolean isActive() {
		return true;
	}

}
