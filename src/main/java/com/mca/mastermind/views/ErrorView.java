package com.mca.mastermind.views;

import com.mca.mastermind.types.Error;
import com.mca.mastermind.utils.WithConsoleView;

class ErrorView extends WithConsoleView{

	static final String[] MESSAGES = { 
		"Repeated colors",
		"Wrong colors, they must be: " + ColorView.allInitials(), 
		"Wrong proposed combination length" };

	Error error;

	ErrorView(Error error) {
		this.error = error;
	}
	
	void writeln() {
		this.console.writeln(ErrorView.MESSAGES[this.error.ordinal()]);
	}	
	
}
