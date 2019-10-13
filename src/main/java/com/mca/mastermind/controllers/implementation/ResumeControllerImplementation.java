package com.mca.mastermind.controllers.implementation;

import com.mca.mastermind.controllers.ResumeController;
import com.mca.mastermind.models.Session;
import com.mca.mastermind.models.SessionImplementation;

public class ResumeControllerImplementation extends ResumeController {

	public ResumeControllerImplementation(Session session) {
		super(session);
	}

	@Override
	public void resume(boolean newGame) {
		if (newGame) {
			((SessionImplementation) this.session).clearGame();
		} else {
			((SessionImplementation) this.session).next();
		}
	}

}
