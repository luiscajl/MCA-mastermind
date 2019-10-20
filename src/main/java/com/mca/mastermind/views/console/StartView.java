package com.mca.mastermind.views.console;

import com.mca.mastermind.utils.WithConsoleView;
import com.mca.mastermind.views.MessageView;

public class StartView extends WithConsoleView {

    public void write(int width) {
        this.console.writeln(MessageView.TITLE.getMessage());
        new SecretCombinationView().writeln(width);
    }
}
