package com.mca.mastermind.distributed.dispatchers;

import com.mca.mastermind.controllers.GameController;
import com.mca.mastermind.distributed.dispatchers.TCPIP;

public abstract class Dispatcher {
	
	protected GameController acceptorController;
	
	protected TCPIP tcpip;
	
	public Dispatcher (GameController acceptorController) {
		this.acceptorController = acceptorController;
	}

	public abstract void dispatch();
	
	public void associate(TCPIP tcpip) {
		this.tcpip = tcpip;
	}

}
