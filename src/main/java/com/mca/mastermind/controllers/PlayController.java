package com.mca.mastermind.controllers;

import java.io.IOException;
import java.util.List;
import com.mca.mastermind.models.Session;
import com.mca.mastermind.types.Color;
import com.mca.mastermind.types.Error;

public abstract class PlayController extends GameController {

    protected PlayController(Session session) {
        super(session);
    }

    public abstract Error addProposedCombination(List<Color> colors);

    public abstract void undo();

    public abstract void redo();

    public abstract void next();

    public abstract boolean undoable();

    public abstract boolean redoable();

    @Override
    public abstract boolean isWinner();

    @Override
    public abstract boolean isLooser();

    @Override
    public abstract List<Color> getColors(int position);

    @Override
    public abstract int getBlacks(int position);

    @Override
    public abstract int getWhites(int position);

    @Override
    public abstract int getAttempts();

    @Override
    public void accept(ControllersVisitor controllersVisitor)
            throws IOException {
        controllersVisitor.visit(this);
    }
}
