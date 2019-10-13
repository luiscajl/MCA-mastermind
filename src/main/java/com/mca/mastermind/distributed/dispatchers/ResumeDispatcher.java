package com.mca.mastermind.distributed.dispatchers;

import com.mca.mastermind.controllers.implementation.ResumeControllerImplementation;

public class ResumeDispatcher extends Dispatcher {

	public ResumeDispatcher(ResumeControllerImplementation resumeControllerImplementation) {
		super(resumeControllerImplementation);
	}

	@Override
	public void dispatch() {
		boolean newGame = this.tcpip.receiveBoolean();
		((ResumeControllerImplementation)this.acceptorController).resume(newGame);
	}

}
