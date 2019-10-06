package com.mca.mastermind.views;

import com.mca.mastermind.controllers.StartController;
import com.mca.mastermind.utils.MastermindIO;
import com.mca.mastermind.utils.MastermindMessages;

public class StartView {

    public void interact(StartController startController) {
        MastermindIO.writeln(MastermindMessages.MASTERMIND);
        MastermindIO.writeln(MastermindMessages.ASTERISK);
        startController.start();
    }
}
