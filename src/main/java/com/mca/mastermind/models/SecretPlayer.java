package com.mca.mastermind.models;

/**
 * Class of the secret player with the secret combination
 * 
 * @author luisca
 *
 */
public class SecretPlayer {

    private SecretCombination secretCombination;

    private ProposedPlayer proposedPlayer;

    /**
     * Constructor
     */
    public SecretPlayer() {
    }

    /**
     * Method to prepare the game
     */
    public void prepare() {
        secretCombination = new SecretCombination();
    }

    /**
     * Method to answer with the result of the propose combination
     * 
     * @param proposedCombination
     *            to calculate if is valid and correct
     * @return result with the deaths and damaged
     */
    public Result answer(char[] proposedCombination) {
        return secretCombination.calculateResult(proposedCombination,
                proposedPlayer);
    }

    /**
     * Method to write if is valid for write on command line
     * 
     * @param proposedCombination
     *            the proposed combination
     * @param result
     *            with the deats and damaged
     */
    public void write(char[] proposedCombination, Result result) {
        if (secretCombination.isValidForWrite(proposedCombination)) {
            proposedPlayer.writeProposedCombinations(
                    secretCombination.write(proposedCombination, result));
        }
    }

    /**
     * Method to set the proposed player
     * 
     * @param proposedPlayer
     *            the proposed player
     */
    public void setProposedPlayer(ProposedPlayer proposedPlayer) {
        this.proposedPlayer = proposedPlayer;
    }
}
