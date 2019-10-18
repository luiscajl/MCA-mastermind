package com.mca.mastermind.views.console;

import com.mca.mastermind.types.Color;
import com.mca.mastermind.utils.Console;

class ColorView extends com.mca.mastermind.views.ColorView {

	ColorView(Color color) {
		super(color);
	}
	
	void write() {
		new Console().write(ColorView.INITIALS[this.color.ordinal()]);
	}

}
