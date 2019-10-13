package com.mca.mastermind.distributed.dispatchers;

import com.mca.mastermind.controllers.implementation.PlayControllerImplementation;

public class WidthDispatcher extends Dispatcher {

	public WidthDispatcher(PlayControllerImplementation playControllerImplementation) {
		super(playControllerImplementation);
	}

	@Override
	public void dispatch() {
		this.tcpip.send(this.acceptorController.getWidth());
	}

}
