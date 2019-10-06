package com.mca.mastermind.models;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private static final int MAX_ATTEMPTS = 10;

    private State state;

    private SecretCombination secretCombination;

    private List<ProposedCombination> proposedCombinations;

    private List<Result> results;

    private int attempts;

    public Game() {
        state = new State();
        this.attempts = 0;
        this.secretCombination = new SecretCombination();
        this.proposedCombinations = new ArrayList<>();
        this.results = new ArrayList<>();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        assert state != null;
        this.state = state;
    }

    public Result addProposedCombination(List<Color> colors) {
        ProposedCombination proposedCombination = new ProposedCombination(
                colors);
        proposedCombinations.add(proposedCombination);
        Result result = this.secretCombination.getResult(proposedCombination);
        this.results.add(result);
        this.attempts++;
        return result;
    }

    public int attemptsLeft() {
        return MAX_ATTEMPTS - attempts;
    }

    public boolean isLooser() {
        return attempts == MAX_ATTEMPTS;
    }

    public boolean isWinner() {
        return this.results.get(this.attempts - 1).getDeaths() == 4;
    }

    public void clear() {
        this.secretCombination = new SecretCombination();
        this.attempts = 0;
        this.state = new State();
    }

    public int getAttempts() {
        return attempts;
    }

    public List<Color> getColors(int position) {
        return proposedCombinations.get(position).getColors();
    }

    public int getDeaths(int position) {
        return this.results.get(position).getDeaths();
    }

    public int getDamaged(int position) {
        return this.results.get(position).getDamaged();
    }

    public int getWidth() {
        return Combination.getWidth();
    }
}
