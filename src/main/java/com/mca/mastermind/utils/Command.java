package com.mca.mastermind.utils;

import java.io.IOException;

public abstract class Command extends WithConsoleView {

    protected String title;

    protected Command(String title) {
        this.title = title;
    }

    protected abstract void execute() throws IOException;

    protected abstract boolean isActive();

    String getTitle() {
        return this.title;
    }
}
