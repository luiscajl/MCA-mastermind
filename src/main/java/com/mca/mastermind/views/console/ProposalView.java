package com.mca.mastermind.views.console;

import java.util.List;
import com.mca.mastermind.controllers.ProposalController;
import com.mca.mastermind.types.Color;
import com.mca.mastermind.types.Error;
import com.mca.mastermind.utils.WithConsoleView;
import com.mca.mastermind.views.MessageView;
import com.mca.mastermind.views.console.ErrorView;

class ProposalView extends WithConsoleView {

	private ProposalController proposalController;

	private SecretCombinationView secretCombinationView;

	private ProposedCombinationView proposedCombinationView;

	private ResultView resultView;

	ProposalView(ProposalController proposalController) {
		this.proposalController = proposalController;
		this.secretCombinationView = new SecretCombinationView(this.proposalController);
		this.proposedCombinationView = new ProposedCombinationView(this.proposalController);
		this.resultView = new ResultView(this.proposalController);
	}

	boolean interact() {
		Error error;
		do {
			List<Color> colors = this.proposedCombinationView.read();
			error = this.proposalController.addProposedCombination(colors);
			if (error != null) {
				new ErrorView(error).writeln();
			}
		} while (error != null);
		this.console.writeln();
		new AttemptsView(this.proposalController).writeln();
		this.secretCombinationView.writeln();
		for (int i = 0; i < this.proposalController.getAttempts(); i++) {
			this.proposedCombinationView.write(i);
			this.resultView.writeln(i);
		}
		if (this.proposalController.isWinner()) {
			this.console.writeln(MessageView.WINNER.getMessage());
			return true;
		} else if (this.proposalController.isLooser()) {
			this.console.writeln(MessageView.LOOSER.getMessage());
			return true;
		}
		return false;
	}

}
