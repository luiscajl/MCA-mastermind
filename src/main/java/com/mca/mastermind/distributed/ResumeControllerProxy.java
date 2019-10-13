package com.mca.mastermind.distributed;

import com.mca.mastermind.controllers.ResumeController;
import com.mca.mastermind.distributed.dispatchers.FrameType;
import com.mca.mastermind.distributed.dispatchers.TCPIP;
import com.mca.mastermind.models.Session;

public class ResumeControllerProxy extends ResumeController {
	
	private TCPIP tcpip;

	ResumeControllerProxy(Session session, TCPIP tcpip) {
		super(session);
		this.tcpip = tcpip;
	}

	@Override
	public void isNewGame(boolean newGame) {
		this.tcpip.send(FrameType.NEW_GAME.name());
		this.tcpip.send(newGame);	
	}

}
