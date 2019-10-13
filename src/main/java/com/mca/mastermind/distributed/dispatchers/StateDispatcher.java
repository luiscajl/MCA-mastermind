package com.mca.mastermind.distributed.dispatchers;

import com.mca.mastermind.controllers.implementation.PlayControllerImplementation;

public class StateDispatcher extends Dispatcher {

	public StateDispatcher(PlayControllerImplementation playControllerImplementation) {
		super(playControllerImplementation);
	}

	@Override
	public void dispatch() {
		this.tcpip.send(this.acceptorController.getValueState().ordinal());
	}

}
