package com.mca.mastermind.controllers;

import java.util.List;
import com.mca.mastermind.models.Color;
import com.mca.mastermind.models.MastermindError;
import com.mca.mastermind.models.Session;

public class PlayController extends GameController {

    private ProposalController proposalController;

    private UndoController undoController;

    private RedoController redoController;

    PlayController(Session session) {
        super(session);
        this.proposalController = new ProposalController(this.session);
        this.undoController = new UndoController(this.session);
        this.redoController = new RedoController(this.session);
    }

    public MastermindError addProposedCombination(List<Color> colors) {
        return this.proposalController.addProposedCombination(colors);
    }

    public void undo() {
        this.undoController.undo();
    }

    public void redo() {
        this.redoController.redo();
    }

    public boolean undoable() {
        return this.undoController.undoable();
    }

    public boolean redoable() {
        return this.redoController.redoable();
    }

    public boolean isWinner() {
        return this.proposalController.isWinner();
    }

    public boolean isLooser() {
        return this.proposalController.isLooser();
    }

    public int getAttempts() {
        return this.proposalController.getAttempts();
    }

    public List<Color> getColors(int position) {
        return this.proposalController.getColors(position);
    }

    public int getBlacks(int position) {
        return this.proposalController.getBlacks(position);
    }

    public int getWhites(int position) {
        return this.proposalController.getWhites(position);
    }

    @Override
    public void accept(ControllersVisitor controllersVisitor) {
        controllersVisitor.visit(this);
    }
}
