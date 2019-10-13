package com.mca.mastermind.views.models;

import java.util.ArrayList;
import java.util.List;
import com.mca.mastermind.controllers.GameController;
import com.mca.mastermind.types.Color;
import com.mca.mastermind.utils.WithConsoleView;
import com.mca.mastermind.views.models.ColorView;

public class ProposedCombinationView extends WithConsoleView {
	
	private GameController gameController;
	
	public ProposedCombinationView(GameController gameController) {
		this.gameController = gameController;
	}
	
	void write(int i) {
		for (Color color : this.gameController.getColors(i)) {
			new ColorView(color).write();
		}
	}

	public List<Color> read() {
		String characters = this.console.readString(MessageView.PROPOSED_COMBINATION.getMessage());
		List<Color> colors = new ArrayList<Color>();
		for (int i=0; i<characters.length(); i++) {
			colors.add(ColorView.getInstance(characters.charAt(i)));
		}
		return colors;
	}
	
}
