package com.mca.mastermind.views.console;

import com.mca.mastermind.controllers.ResumeController;
import com.mca.mastermind.utils.YesNoDialog;
import com.mca.mastermind.views.MessageView;

class ResumeView {
	
	private ResumeController resumeController;

	ResumeView(ResumeController resumeController) {
		this.resumeController = resumeController;
	}

	boolean interact() {
		boolean newGame = new YesNoDialog().read(MessageView.RESUME.getMessage());
		if (newGame) {
			this.resumeController.clearGame();			
		}
		return newGame;
	}

}
