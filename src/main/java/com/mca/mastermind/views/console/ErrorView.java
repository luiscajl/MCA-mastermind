package com.mca.mastermind.views.console;

import com.mca.mastermind.types.Error;
import com.mca.mastermind.utils.Console;

public class ErrorView extends com.mca.mastermind.views.ErrorView {

    public ErrorView(Error error) {
        super(error);
    }

    @Override
    public void writeln() {
        new Console().writeln(ErrorView.MESSAGES[this.error.ordinal()]);
    }
}
