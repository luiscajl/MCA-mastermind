package com.mca.mastermind.views.menus;

import java.io.IOException;
import com.mca.mastermind.controllers.StartController;
import com.mca.mastermind.views.models.MessageView;

class OpenGameCommand extends Command {

    protected OpenGameCommand(StartController startController) {
        super(MessageView.OPENGAME_COMMAND.getMessage(), startController);
    }

    @Override
    protected void execute() throws IOException {
        new GameSelectMenu((StartController) this.acceptorController).execute();
    }

    @Override
    protected boolean isActive() {
        return true;
    }
}
