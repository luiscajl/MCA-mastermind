package com.mca.mastermind.views.console;

import com.mca.mastermind.types.Error;
import com.mca.santaTecla.utils.Console;

class ErrorView extends com.mca.mastermind.views.ErrorView {

    ErrorView(Error error) {
        super(error);
    }

    void writeln() {
        new Console().writeln(ErrorView.MESSAGES[this.error.ordinal()]);
    }
}
