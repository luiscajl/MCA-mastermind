package com.mca.mastermind.views.console;

import com.mca.mastermind.utils.WithConsoleView;
import com.mca.mastermind.views.MessageView;

public class AttemptsView extends WithConsoleView {

    void writeln(int attemps) {
        MessageView.ATTEMPTS.writeln(attemps);
    }
}
