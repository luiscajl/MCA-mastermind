package com.mca.mastermind.views;

import com.mca.mastermind.controllers.Controller;
import com.mca.mastermind.utils.WithConsoleView;

public class SecretCombinationView extends WithConsoleView {

    private Controller controller;

    public SecretCombinationView(Controller controller) {
        super();
        this.controller = controller;
    }

    public void writeln() {
        for (int i = 0; i < this.controller.getWidth(); i++) {
            this.console.write(MessageView.SECRET.getMessage());
        }
        this.console.writeln();
    }
}
