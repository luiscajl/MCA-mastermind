package com.mca.mastermind.controllers;

import com.mca.mastermind.models.Session;

public abstract class ResumeController extends GameController {

	public ResumeController(Session session) {
		super(session);
	}

	public abstract void resume(boolean newGame);

	@Override
	public void accept(ControllersVisitor controllersVisitor) {
		controllersVisitor.visit(this);
	}

}
