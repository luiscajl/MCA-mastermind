package com.mca.mastermind.views.menus;

import com.mca.mastermind.controllers.StartController;
import com.mca.mastermind.utils.Menu;

public class StartMenu extends Menu {

	public StartMenu(StartController startController) {
		this.addCommand(new NewGameCommand(startController));
		this.addCommand(new OpenGameCommand(startController));
	}
}
