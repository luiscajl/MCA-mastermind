package com.mca.mastermind.distributed;

import com.mca.mastermind.distributed.dispatchers.FrameType;
import com.mca.mastermind.models.Session;
import com.mca.mastermind.models.StateValue;
import com.mca.mastermind.utils.TCPIP;

public class SessionProxy implements Session {
	
	private TCPIP tcpip;

	public SessionProxy(TCPIP tcpip) {
		this.tcpip = tcpip;
	}
	
	@Override
	public StateValue getValueState() {
		this.tcpip.send(FrameType.STATE.name());
		return StateValue.values()[this.tcpip.receiveInt()];
	}

	@Override
	public int getWidth() {
		this.tcpip.send(FrameType.WIDTH.name());
		return this.tcpip.receiveInt();
	}

}
