package com.mca.mastermind.views;

import com.mca.mastermind.controllers.StartController;

public class StartView {

    private SecretCombinationView secretCombinationView;

    public void interact(StartController startController) {
        startController.start();
        MessageView.TITLE.writeln();
        this.secretCombinationView = new SecretCombinationView(startController);
        this.secretCombinationView.writeln();
    }
}
