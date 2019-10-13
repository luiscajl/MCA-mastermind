package com.mca.mastermind.views.menus;

import com.mca.mastermind.controllers.AcceptorController;

abstract class Command extends com.mca.mastermind.utils.Command {

	protected AcceptorController acceptorController;

	protected Command(String title, AcceptorController acceptorController) {
		super(title);
		this.acceptorController = acceptorController;
	}
	
}
