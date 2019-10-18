package com.mca.mastermind.controllers;

import com.mca.mastermind.models.Combination;
import com.mca.mastermind.models.Game;

public abstract class Controller {

	protected Game game;

	Controller(Game game) {
		this.game = game;
	}

	public int getWidth() {
		return Combination.getWidth();
	}

}
