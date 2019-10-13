package com.mca.mastermind.distributed;

import com.mca.mastermind.distributed.dispatchers.FrameType;
import com.mca.mastermind.distributed.dispatchers.TCPIP;
import com.mca.mastermind.models.Session;
import com.mca.mastermind.models.StateValue;

public class SessionProxy implements Session {
	
	private TCPIP tcpip;

	SessionProxy(TCPIP tcpip) {
		this.tcpip = tcpip;
	}

	@Override
	public void setName(String title) {
		this.tcpip.send(FrameType.SET_TITLE.name());
		this.tcpip.send(title);
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

	@Override
	public String getName() {
		this.tcpip.send(FrameType.GET_TITLE.name());
		return this.tcpip.receiveLine();
	}

}
