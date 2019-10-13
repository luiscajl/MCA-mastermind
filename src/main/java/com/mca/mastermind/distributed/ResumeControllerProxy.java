package com.mca.mastermind.distributed;

import com.mca.mastermind.controllers.ResumeController;
import com.mca.mastermind.distributed.dispatchers.FrameType;
import com.mca.mastermind.models.Session;
import com.mca.mastermind.utils.TCPIP;

public class ResumeControllerProxy extends ResumeController {
	
	private TCPIP tcpip;

	public ResumeControllerProxy(Session session, TCPIP tcpip) {
		super(session);
		this.tcpip = tcpip;
	}

	@Override
	public void resume(boolean newGame) {
		this.tcpip.send(FrameType.NEW_GAME.name());
		this.tcpip.send(newGame);	
	}

}
