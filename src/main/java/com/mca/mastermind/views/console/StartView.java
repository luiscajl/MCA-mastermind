package com.mca.mastermind.views.console;

import com.mca.mastermind.controllers.StartController;
import com.mca.mastermind.utils.WithConsoleView;
import com.mca.mastermind.views.MessageView;

class StartView extends WithConsoleView {
	
	private StartController startController;
	
	private SecretCombinationView secretCombinationView;
	
	StartView (StartController startController){
		this.startController = startController;
		this.secretCombinationView = new SecretCombinationView(this.startController);
	}

	void interact() {
		this.console.writeln(MessageView.TITLE.getMessage());
		this.secretCombinationView.writeln();
	}

}
