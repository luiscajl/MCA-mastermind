package com.mca.mastermind.views;

import com.mca.mastermind.controllers.PlayController;
import com.mca.mastermind.utils.Menu;

public class PlayMenu extends Menu {

	public PlayMenu(PlayController playController) {
		this.addCommand(new ProposeCommand(playController));
		this.addCommand(new UndoCommand(playController));
		this.addCommand(new RedoCommand(playController));
	}

}
