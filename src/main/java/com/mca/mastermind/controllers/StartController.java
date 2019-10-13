package com.mca.mastermind.controllers;

import com.mca.mastermind.models.Session;

public abstract class StartController extends GameController {

	public StartController(Session session) {
		super(session);
	}
	
	public abstract void start();
	
	@Override
	public void accept(ControllersVisitor controllersVisitor) {
		controllersVisitor.visit(this);
	}

}
