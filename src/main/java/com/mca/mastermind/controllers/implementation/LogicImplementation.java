package com.mca.mastermind.controllers.implementation;

import com.mca.mastermind.controllers.Logic;
import com.mca.mastermind.models.SessionImplementation;
import com.mca.mastermind.models.StateValue;

public class LogicImplementation extends Logic {

	protected StartControllerImplementation startControllerImplementation;

	protected PlayControllerImplementation playControllerImplementation;

	protected ResumeControllerImplementation resumeControllerImplementation;

	public LogicImplementation() {
		this.session = new SessionImplementation();
		this.startControllerImplementation = new StartControllerImplementation(this.session);
		this.playControllerImplementation = new PlayControllerImplementation(this.session);
		this.resumeControllerImplementation = new ResumeControllerImplementation(this.session);
		this.gameControllers.put(StateValue.INITIAL, this.startControllerImplementation);
		this.gameControllers.put(StateValue.IN_GAME, this.playControllerImplementation);
		this.gameControllers.put(StateValue.FINAL, this.resumeControllerImplementation);
		this.gameControllers.put(StateValue.EXIT, null);
	}

}
