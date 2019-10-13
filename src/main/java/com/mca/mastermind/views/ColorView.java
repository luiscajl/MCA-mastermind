package com.mca.mastermind.views;

import com.mca.mastermind.types.Color;
import com.mca.mastermind.utils.WithConsoleView;

class ColorView extends WithConsoleView{

	static final char[] INITIALS = { 'r', 'b', 'y', 'g', 'o', 'p' };

	protected Color color;

	ColorView(Color color) {
		this.color = color;
	}

	static String allInitials() {
		String result = "";
		for (char character : ColorView.INITIALS) {
			result += character;
		}
		return result;
	}

	char getInitial() {
		return ColorView.INITIALS[this.color.ordinal()];
	}

	static Color getInstance(char character) {
		for (int i = 0; i < ColorView.INITIALS.length; i++) {
			if (ColorView.INITIALS[i] == character) {
				return Color.values()[i];
			}
		}
		return null;
	}

	void write() {
		this.console.write(ColorView.INITIALS[this.color.ordinal()]);
	}

}
