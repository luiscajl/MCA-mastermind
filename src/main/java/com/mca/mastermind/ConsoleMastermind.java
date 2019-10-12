package com.mca.mastermind;

import com.mca.mastermind.views.View;
import com.mca.mastermind.views.console.ConsoleView;

public class ConsoleMastermind extends Mastermind {

    @Override
    protected View createView() {
        return new ConsoleView();
    }

    public static void main(String[] args) {
        new ConsoleMastermind().play();
    }
}
