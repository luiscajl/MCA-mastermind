package com.mca.mastermind.controllers;

import com.mca.mastermind.models.Session;
import com.mca.mastermind.models.SessionImplementation;

public class ExitController extends Controller {

	public ExitController(Session session) {
		super(session);
	}

	public void next() {
		((SessionImplementation) this.session).next();
	}

}
