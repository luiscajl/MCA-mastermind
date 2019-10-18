package com.mca.mastermind.views.console;

import com.mca.mastermind.controllers.ProposalController;
import com.mca.mastermind.utils.WithConsoleView;
import com.mca.mastermind.views.MessageView;

class ResultView extends WithConsoleView {

	private ProposalController proposalController;

	ResultView(ProposalController proposalController) {
		this.proposalController = proposalController;
	}

	void writeln(int position) {
		this.console.writeln(MessageView.RESULT.getMessage()
				.replaceFirst("#blacks", "" + this.proposalController.getBlacks(position))
						.replaceFirst("#whites", "" + this.proposalController.getWhites(position)));
	}

}
