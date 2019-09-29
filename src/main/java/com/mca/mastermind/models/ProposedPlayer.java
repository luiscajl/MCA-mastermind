package com.mca.mastermind.models;

import com.mca.mastermind.utils.MastermindConstants;

/**
 * Class for the main player
 * 
 * @author luisca
 *
 */
public class ProposedPlayer {

    private int attempts;

    private boolean endgame;

    private ProposedCombination proposedCombination;

    private String proposedCombinations;

    /**
     * Constructor
     */
    public ProposedPlayer() {
        proposedCombination = new ProposedCombination();
        attempts = 0;
        endgame = false;
        proposedCombinations = "";
    }

    /**
     * Method to propose the command line scanner
     * 
     * @return char array with the proposed combination
     */
    public char[] propose() {
        proposedCombination.setProposedCombination(proposedCombination.read());
        return proposedCombination.getProposedCombination();
    }

    /**
     * Method to get the last propose
     * 
     * @return char array with the lastPropose combination
     */
    public char[] getLastPropose() {
        return this.proposedCombination.getProposedCombination();
    }

    /**
     * Method to write attemps on the command line
     */
    public void writeAttempts() {
        if (attempts > 0) {
            System.out.println(attempts + " attempts(s):");
        }
    }

    /**
     * Method to set the proposedCombination
     * 
     * @param combination
     *            on string
     */
    public void setProposedCombinations(String combination) {
        this.proposedCombinations = combination;
    }

    /**
     * Method to write on command line all the proposedCombinations
     * 
     * @param combination
     */
    public void writeProposedCombinations(String combination) {
        proposedCombinations += combination + "\n";
        System.out.println(proposedCombinations);
    }

    /**
     * Method to write on command line winner
     */
    public void isWinner() {
        System.out.println(MastermindConstants.WINNER);
    }

    /**
     * Method to write on command line losser
     */
    public void isLooser() {
        System.out.println(MastermindConstants.LOSSER);
    }

    /**
     * Method to set the attemps
     * 
     * @param attempts
     *            int to set
     */
    public void setAttempts(int attempts) {
        this.attempts = attempts;
        if (this.attempts >= 10) {
            setEndGame(true);
        }
    }

    /**
     * Method to return the num of attemps of the player
     * 
     * @return int attemps
     */
    public int getAttempts() {
        return attempts;
    }

    /**
     * Method to set end game
     * 
     * @param endgame
     *            boolean to set the end
     */
    public void setEndGame(boolean endgame) {
        this.endgame = endgame;
    }

    /**
     * Method to return the attribute endgame
     * 
     * @return
     */
    public boolean getEndGame() {
        return endgame;
    }
}
