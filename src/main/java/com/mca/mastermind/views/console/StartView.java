package com.mca.mastermind.views.console;

import com.mca.mastermind.controllers.StartController;
import com.mca.mastermind.views.MessageView;
import com.mca.santaTecla.utils.WithConsoleView;

class StartView extends WithConsoleView {

    private SecretCombinationView secretCombinationView;

    void interact(StartController startController) {
        startController.start();
        this.console.writeln(MessageView.TITLE.getMessage());
        this.secretCombinationView = new SecretCombinationView(startController);
        this.secretCombinationView.writeln();
    }
}
