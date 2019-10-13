package com.mca.mastermind.commands;

import com.mca.mastermind.controllers.PlayController;
import com.mca.mastermind.views.GameView;
import com.mca.mastermind.views.MessageView;

public class UndoCommand extends PlayCommand {

    public UndoCommand(PlayController playController) {
        super(MessageView.UNDO_COMMAND.getMessage(), 2, playController);
    }

    @Override
    public void execute() {
        this.playController.undo();
        new GameView(this.playController);
    }

    @Override
    public boolean isActive() {
        return this.playController.undoable();
    }
}
