package com.mca.mastermind.controllers;

import com.mca.mastermind.models.Session;
import com.mca.mastermind.models.SessionImplementation;

public class UndoController extends Controller {

	public UndoController(Session session) {
		super(session);
	}

	public void undo() {
		((SessionImplementation) this.session).undo();
	}

	public boolean undoable() {
		return ((SessionImplementation) this.session).undoable();
	}

}
