package com.mca.mastermind.views.console;

import com.mca.mastermind.utils.WithConsoleView;
import com.mca.mastermind.views.MessageView;

public class SecretCombinationView extends WithConsoleView {

    void writeln(int length) {
        for (int i = 0; i < length; i++) {
            this.console.write(MessageView.SECRET.getMessage());
        }
        MessageView.NEW_LINE.writeln();
    }
}
