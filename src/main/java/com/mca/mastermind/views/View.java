package com.mca.mastermind.views;

import com.mca.mastermind.controllers.ProposalController;
import com.mca.mastermind.controllers.ResumeController;
import com.mca.mastermind.controllers.StartController;

public abstract class View {
	
	protected StartController startController;

	protected ProposalController proposalController;

	protected ResumeController resumeController;

	public View(StartController startController, ProposalController proposalController, ResumeController resumeController) {
		this.startController = startController;
		this.proposalController = proposalController;
		this.resumeController = resumeController;
	}

	public void interact() {
		boolean newGame;
		do {
			this.start();
			boolean finished;
			do {
				finished = this.propose();
			} while (!finished);
			newGame = this.isNewGame();
		} while (newGame);
	}

	protected abstract void start();

	protected abstract boolean propose();

	protected abstract boolean isNewGame();

}
