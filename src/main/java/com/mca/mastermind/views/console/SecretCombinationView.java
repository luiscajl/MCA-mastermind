package com.mca.mastermind.views.console;

import com.mca.mastermind.controllers.Controller;
import com.mca.mastermind.views.MessageView;
import com.mca.santaTecla.utils.WithConsoleView;

class SecretCombinationView extends WithConsoleView {

    private Controller controller;

    SecretCombinationView(Controller controller) {
        super();
        this.controller = controller;
    }

    void writeln() {
        for (int i = 0; i < this.controller.getWidth(); i++) {
            this.console.write(MessageView.SECRET.getMessage());
        }
        this.console.writeln();
    }
}
