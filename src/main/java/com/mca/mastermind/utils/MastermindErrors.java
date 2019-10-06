package com.mca.mastermind.utils;

public enum MastermindErrors {

    REPEATED_COLORS("Repeated colors"),
    WRONG_CHARACTERS("Wrong colors, they must be: rbygop"),
    WRONG_LENGTH("Wrong proposed combination length");

    private String message;

    private MastermindErrors(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
