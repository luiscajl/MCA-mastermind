package com.mca.mastermind.models;

public class SecretPlayer {

    private SecretCombination secretCombination;

    public SecretPlayer(ProposedPlayer proposedPlayer) {
    }

    public void prepare() {
        secretCombination = new SecretCombination();
    }

    public void answer(String combination) {
        secretCombination.calculateResult(new ProposedCombination());
        System.out.println();
    }

    private boolean repeatColors(String combination) {
        // TODO Auto-generated method stub
        return false;
    }

    private boolean isWrongColors(String combination) {
        // TODO Auto-generated method stub
        return false;
    }

    public void write() {
    }
}
