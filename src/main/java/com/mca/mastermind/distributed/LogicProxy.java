package com.mca.mastermind.distributed;

import com.mca.mastermind.controllers.Logic;
import com.mca.mastermind.distributed.dispatchers.TCPIP;
import com.mca.mastermind.models.StateValue;

public class LogicProxy extends Logic {
	
	private TCPIP tcpip;
	
	public LogicProxy() {
		this.tcpip = TCPIP.createClientSocket();
		this.session = new SessionProxy(this.tcpip);
		this.gameControllers.put(StateValue.INITIAL, new StartControllerProxy(this.session,this.tcpip));
		this.gameControllers.put(StateValue.IN_GAME, new PlayControllerProxy(this.session,this.tcpip));
		this.gameControllers.put(StateValue.FINAL, new ResumeControllerProxy(this.session,this.tcpip));
		this.gameControllers.put(StateValue.EXIT, null);
	}

	public void close() {
		this.tcpip.close();
	}
	
}
