package com.mca.mastermind.views.console;

import com.mca.mastermind.utils.WithConsoleView;
import com.mca.mastermind.views.MessageView;

class ResultView extends WithConsoleView {

    void writeln(int blacks, int whites) {
        MessageView.RESULT.writeln(blacks, whites);
    }
}
