package com.mca.mastermind.utils;

public abstract class Command extends WithConsoleView {

    protected String title;

    protected int number;

    protected Command(String title, int number) {
        this.title = title;
        this.number = number;
    }

    public abstract void execute();

    public abstract boolean isActive();

    public String getTitle() {
        return title;
    }

    public int getNumber() {
        return number;
    }
}
