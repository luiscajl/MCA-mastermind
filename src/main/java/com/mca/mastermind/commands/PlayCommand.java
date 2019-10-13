package com.mca.mastermind.commands;

import com.mca.mastermind.controllers.PlayController;
import com.mca.mastermind.utils.Command;

public abstract class PlayCommand extends Command {

    protected PlayController playController;

    protected PlayCommand(String title, int number,
            PlayController playController) {
        super(title, number);
        this.playController = playController;
    }
}
