package com.mca.mastermind.views;

import com.mca.mastermind.controllers.ResumeController;
import com.mca.mastermind.utils.YesNoDialog;

class ResumeView {

	void interact(ResumeController resumeController) {
		resumeController.resume(new YesNoDialog().read(MessageView.RESUME.getMessage()));
	}
	
}
