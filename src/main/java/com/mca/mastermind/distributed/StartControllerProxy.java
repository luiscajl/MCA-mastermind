package com.mca.mastermind.distributed;

import com.mca.mastermind.controllers.StartController;
import com.mca.mastermind.distributed.dispatchers.FrameType;
import com.mca.mastermind.models.Session;
import com.mca.mastermind.utils.TCPIP;

public class StartControllerProxy extends StartController {
	
	private TCPIP tcpip;

	public StartControllerProxy(Session session, TCPIP tcpip) {
		super(session);
		this.tcpip = tcpip;
	}

	@Override
	public void start() {
		this.tcpip.send(FrameType.START.name());
	}

}
