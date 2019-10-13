package com.mca.mastermind.views;

import com.mca.mastermind.controllers.PlayController;

class PlayView {

	void interact(PlayController playController) {
		new PlayMenu(playController).execute();	
	}

}
