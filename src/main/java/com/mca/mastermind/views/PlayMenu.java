package com.mca.mastermind.views;

import com.mca.mastermind.commands.ProposeCommand;
import com.mca.mastermind.commands.RedoCommand;
import com.mca.mastermind.commands.UndoCommand;
import com.mca.mastermind.controllers.PlayController;
import com.mca.mastermind.models.Menu;

class PlayMenu extends Menu {

    PlayMenu(PlayController playController) {
        this.addCommand(new ProposeCommand(playController));
        this.addCommand(new UndoCommand(playController));
        this.addCommand(new RedoCommand(playController));
    }
}
