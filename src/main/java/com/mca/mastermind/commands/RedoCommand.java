package com.mca.mastermind.commands;

import com.mca.mastermind.controllers.PlayController;
import com.mca.mastermind.views.GameView;
import com.mca.mastermind.views.MessageView;

public class RedoCommand extends PlayCommand {

    public RedoCommand(PlayController playController) {
        super(MessageView.REDO_COMMAND.getMessage(), 3, playController);
    }

    @Override
    public void execute() {
        this.playController.redo();
        new GameView(this.playController);
    }

    @Override
    public boolean isActive() {
        return this.playController.redoable();
    }
}
