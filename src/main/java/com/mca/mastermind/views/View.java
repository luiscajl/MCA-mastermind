package com.mca.mastermind.views;

import com.mca.mastermind.controllers.GameController;
import com.mca.mastermind.controllers.ControllersVisitor;
import com.mca.mastermind.controllers.PlayController;
import com.mca.mastermind.controllers.ResumeController;
import com.mca.mastermind.controllers.StartController;

public class View implements ControllersVisitor {

	private StartView startView;

	private PlayView playView;

	private ResumeView resumeView;

	public View() {
		this.startView = new StartView();
		this.playView = new PlayView();
		this.resumeView = new ResumeView();
	}

	public void interact(GameController acceptorController) {
		acceptorController.accept(this);
	}

	@Override
	public void visit(StartController startController) {
		this.startView.interact(startController);
	}

	@Override
	public void visit(PlayController playController) {
		this.playView.interact(playController);
	}

	@Override
	public void visit(ResumeController resumeController) {
		this.resumeView.interact(resumeController);
	}

}
