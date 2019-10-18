package com.mca.mastermind.views.console;

import com.mca.mastermind.controllers.ProposalController;
import com.mca.mastermind.controllers.ResumeController;
import com.mca.mastermind.controllers.StartController;
import com.mca.mastermind.views.View;

public class ConsoleView extends View {

	private StartView startView;

	private ProposalView proposalView;

	private ResumeView resumeView;

	public ConsoleView(StartController startController, ProposalController proposalController, ResumeController resumeController) {
		super(startController, proposalController, resumeController);
		this.startView = new StartView(this.startController);
		this.proposalView = new ProposalView(this.proposalController);
		this.resumeView = new ResumeView(this.resumeController);
	}

	@Override
	protected void start() {
		this.startView.interact();
	}

	@Override
	protected boolean propose() {
		return this.proposalView.interact();
	}

	@Override
	protected boolean isNewGame() {
		return this.resumeView.interact();
	}

}
