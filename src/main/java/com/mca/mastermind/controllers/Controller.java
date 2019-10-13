package com.mca.mastermind.controllers;

import com.mca.mastermind.models.Session;
import com.mca.mastermind.models.StateValue;

public abstract class Controller {

	protected Session session;

	Controller(Session session) {
		this.session = session;
	}

	public void setName(String name) {
		this.session.setName(name);
	}

	public int getWidth() {
		return this.session.getWidth();
	}

	public StateValue getValueState() {
		return this.session.getValueState();
	}

	public String getName() {
		return this.session.getName();
	}

}
