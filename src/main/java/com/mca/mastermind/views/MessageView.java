package com.mca.mastermind.views;

import com.mca.mastermind.utils.Console;

public enum MessageView {

    ATTEMPTS(" attempt(s):"),
    SECRET("*"),
    RESUME("Do you want to continue"),
    RESULT(" --> #blacks blacks and #whites whites"),
    PROPOSED_COMBINATION("Propose a combination: "),
    TITLE("----- MASTERMIND -----"),
    WINNER("You've won!!! ;-)"),
    LOOSER("You've lost!!! :-("),
    PROPOSE_COMMAND("Propose Combination"),
    UNDO_COMMAND("Undo previous Proposal"),
    REDO_COMMAND("Redo previous Proposal"),
    CONTEXT_MENU("1. Console View\n2. Graphic view(NOT WORK)\n3. Exit"),
    NEW_LINE("");

    private String message;

    private Console console;

    private MessageView(String message) {
        this.message = message;
        this.console = new Console();
    }

    public String getMessage() {
        return this.message;
    }

    public void writeln() {
        this.console.writeln(getMessage());
    }

    public void writeln(int attemps) {
        this.console.writeln(attemps + getMessage());
    }

    public void writeln(int blacks, int whites) {
        this.console.writeln(getMessage().replaceAll("#blacks", "" + blacks)
                .replaceAll("#whites", "" + whites));
    }
}
