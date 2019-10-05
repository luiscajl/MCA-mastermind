package com.mca.mastermind.models;

public class Game {

    private static final int MAX_ATTEMPTS = 10;

    private State state;

    private Pattern secretPattern;

    private SecretCombination secretCombination;

    private int attempts;

    public Game() {
        state = new State();
        this.attempts = 0;
        this.secretCombination = new SecretCombination();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        assert state != null;
        this.state = state;
    }

    public Result makeAGuess(Pattern guess) {
        assert guess != null;
        attempts++;
        return secretPattern.compareTo(guess);
    }

    public int attemptsLeft() {
        return MAX_ATTEMPTS - attempts;
    }

    public void clear() {
        this.secretCombination = new SecretCombination();
        this.attempts = 0;
        this.state = new State();
    }
}
