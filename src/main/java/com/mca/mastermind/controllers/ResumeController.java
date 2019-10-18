package com.mca.mastermind.controllers;

import com.mca.mastermind.models.Game;

public class ResumeController extends Controller {

	public ResumeController(Game game) {
		super(game);
	}

	public void clearGame() {
		this.game.clear();
	}

}
