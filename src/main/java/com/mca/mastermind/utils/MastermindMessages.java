package com.mca.mastermind.utils;

/**
 * Mastermind constants
 * 
 * @author luisca
 *
 */
public enum MastermindMessages {

    PROPOSE_COMBINATION("Propose a combination: "),
    WINNER("You've won!!! ;-)"),
    LOSSER("You've lost!!! :-("),
    WANNA_CONTINUE("Do you want to continue? (s/n):"),
    MASTERMIND("----- MASTERMIND -----"),
    ASTERISK("****"),
    CONTEXT_MENU("1. Console View\n2. Graphic view(NOT WORK)\n3. Exit"),
    ATTEMPTS(" attempt(s):"),
    DEATHS(" deaths "),
    DAMAGED(" damaged "),
    ARROW(" --> ");

    private String message;

    private MastermindMessages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
