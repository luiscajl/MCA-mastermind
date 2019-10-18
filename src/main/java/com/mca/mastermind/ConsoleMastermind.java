package com.mca.mastermind;

import com.mca.mastermind.controllers.ProposalController;
import com.mca.mastermind.controllers.ResumeController;
import com.mca.mastermind.controllers.StartController;
import com.mca.mastermind.views.View;
import com.mca.mastermind.views.console.ConsoleView;

public class ConsoleMastermind extends Mastermind {

	@Override
	protected View createView(StartController startController, ProposalController proposalController,
			ResumeController resumeController) {
		return new ConsoleView(startController, proposalController, resumeController);
	}

	public static void main(String[] args) {
		new ConsoleMastermind().play();
	}

}
