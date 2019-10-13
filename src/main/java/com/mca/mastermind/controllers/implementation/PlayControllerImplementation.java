package com.mca.mastermind.controllers.implementation;

import java.util.List;
import com.mca.mastermind.controllers.PlayController;
import com.mca.mastermind.controllers.ProposalController;
import com.mca.mastermind.controllers.RedoController;
import com.mca.mastermind.controllers.UndoController;
import com.mca.mastermind.models.Session;
import com.mca.mastermind.types.Color;
import com.mca.mastermind.types.Error;

public class PlayControllerImplementation extends PlayController {

	private ProposalController proposalController;

	private UndoController undoController;

	private RedoController redoController;

	PlayControllerImplementation(Session session) {
		super(session);
		this.proposalController = new ProposalController(this.session);
		this.undoController = new UndoController(this.session);
		this.redoController = new RedoController(this.session);
	}

	@Override
	public Error addProposedCombination(List<Color> colors) {
		return this.proposalController.addProposedCombination(colors);
	}

	@Override
	public void undo() {
		this.undoController.undo();
	}

	@Override
	public void redo() {
		this.redoController.redo();
	}

	@Override
	public boolean undoable() {
		return this.undoController.undoable();
	}

	@Override
	public boolean redoable() {
		return this.redoController.redoable();
	}

	@Override
	public boolean isWinner() {
		return this.proposalController.isWinner();
	}

	@Override
	public boolean isLooser() {
		return this.proposalController.isLooser();
	}

	@Override
	public List<Color> getColors(int position) {
		return this.proposalController.getColors(position);
	}

	@Override
	public int getAttempts() {
		return this.proposalController.getAttempts();
	}

	@Override
	public int getBlacks(int position) {
		return this.proposalController.getBlacks(position);
	}

	@Override
	public int getWhites(int position) {
		return this.proposalController.getWhites(position);
	}

}
