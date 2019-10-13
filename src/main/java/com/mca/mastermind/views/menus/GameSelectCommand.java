package com.mca.mastermind.views.menus;

import com.mca.mastermind.controllers.StartController;

class GameSelectCommand extends Command {

	protected GameSelectCommand(String title, StartController startController) {
		super(title, startController);
	}

	@Override
	protected void execute() {
		System.out.println(this.title);
		((StartController) this.acceptorController).start(this.title);
	}

	@Override
	protected boolean isActive() {
		return true;
	}

}
