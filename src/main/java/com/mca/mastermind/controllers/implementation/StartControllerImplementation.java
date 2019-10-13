package com.mca.mastermind.controllers.implementation;

import com.mca.mastermind.controllers.StartController;
import com.mca.mastermind.models.Session;
import com.mca.mastermind.models.SessionImplementation;

public class StartControllerImplementation extends StartController {

	public StartControllerImplementation(Session session) {
		super(session);
	}

	@Override
	public void start() {
		((SessionImplementation) this.session).next();		
	}

}
