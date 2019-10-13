package com.mca.mastermind.views;

import com.mca.mastermind.controllers.PlayController;

public abstract class Command extends com.mca.mastermind.utils.Command {

	protected PlayController playController;

	protected Command(String title, PlayController playController) {
		super(title);
		this.playController = playController;
	}
	
}
