package com.mca.mastermind.models;

public class ProposedPlayer {

    private ProposedCombination proposedCombination;

    private int attemps;

    public ProposedPlayer(int attemps) {
        this.attemps = attemps;
        this.proposedCombination = new ProposedCombination();
    }

    public void propose() {
        proposedCombination.read();
    }

    ProposedPlayer getLastProposedPlayer() {
        return this;
    }

    public void writeAttemps() {
        System.out.println(attemps + " attempt(s)");
    }

    public boolean isWinner() {
        return false;
    }

    public boolean isLooser() {
        return !isWinner();
    }

    public ProposedCombination getProposedCombination() {
        return proposedCombination;
    }

    public void setProposedCombination(
            ProposedCombination proposedCombination) {
        this.proposedCombination = proposedCombination;
    }

    public int getAttemps() {
        return attemps;
    }

    public void setAttemps(int attemps) {
        this.attemps = attemps;
    }
}
