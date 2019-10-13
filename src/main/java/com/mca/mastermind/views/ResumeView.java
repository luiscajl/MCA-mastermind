package com.mca.mastermind.views;

import com.mca.mastermind.controllers.ResumeController;
import com.mca.mastermind.utils.YesNoDialog;
import com.mca.mastermind.views.models.MessageView;

class ResumeView {

	void interact(ResumeController resumeController) {
		resumeController.isNewGame(new YesNoDialog().read(MessageView.RESUME.getMessage()));
	}
	
}
