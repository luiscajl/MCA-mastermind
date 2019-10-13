package com.mca.mastermind.views;

import com.mca.mastermind.models.MastermindError;
import com.mca.mastermind.utils.WithConsoleView;

public class ErrorView extends WithConsoleView {

    public static final String[] MESSAGES = {"Repeated colors",
            "Wrong colors, they must be: " + ColorView.allInitials(),
            "Wrong proposed combination length"};

    private MastermindError mastermindError;

    public ErrorView(MastermindError error) {
        this.mastermindError = error;
    }

    public void writeln() {
        this.console
                .writeln(ErrorView.MESSAGES[this.mastermindError.ordinal()]);
    }
}
