package com.mca.mastermind.models;

import com.mca.mastermind.utils.MastermindConstants;

/**
 * Class of the secret combination of mastermind. Son of Combination
 * 
 * @author luisca
 *
 */
public class SecretCombination extends Combination {

    private char[] secretCombination;

    /**
     * Constructor that create a new secret combination
     */
    public SecretCombination() {
        this.secretCombination = generateSecretCombination();
    }

    /**
     * Method to generate a new secret combination
     * 
     * @return char array with the combination secret
     */
    private char[] generateSecretCombination() {
        int limit = 5, i = 0, j = 0;
        int numVector[] = new int[4];
        char[] secretCombination = new char[4];
        numVector[i] = (int) (Math.random() * limit);
        for (i = 1; i < numVector.length; i++) {
            numVector[i] = (int) (Math.random() * limit);
            for (j = 0; j < i; j++) {
                if (numVector[i] == numVector[j]) {
                    i--;
                }
            }
        }
        for (int k = 0; k < numVector.length; k++) {
            secretCombination[k] = super.colorsToString().charAt(numVector[k]);
        }
        return secretCombination;
    }

    /**
     * Method to validate the proposed combination
     * 
     * @param proposedCombination
     *            char array with the proposed combination
     * @return true if is valid, eoc false
     */
    public boolean isValid(char[] proposedCombination) {
        String character = "";
        String combinationString = "";
        int iteration;
        for (char pc : proposedCombination) {
            if (!super.colorsToString().contains(Character.toString(pc))) {
                System.out.println(MastermindConstants.WRONG_COLORS);
                return false;
            }
            iteration = 0;
            combinationString = new String(proposedCombination);
            character = Character.toString(pc);
            while (combinationString.indexOf(character) != -1) {
                combinationString = combinationString.substring(
                        combinationString.indexOf(character) + 1,
                        combinationString.length());
                iteration++;
            }
            if (iteration > 1) {
                System.out.println(MastermindConstants.REPEATED_COLORS);
                return false;
            }
            if (super.getColors().length < proposedCombination.length
                    || proposedCombination.length != 4) {
                System.out.println(MastermindConstants.WRONG_LENGTH);
                return false;
            }
        }
        return true;
    }

    /**
     * Method to check if is valid for write on screen
     * 
     * @param proposedCombination
     *            char array with the proposed combination
     * @return true if is valid, eoc false
     */
    public boolean isValidForWrite(char[] proposedCombination) {
        String character = "";
        String combinationString = "";
        int iteration;
        for (char pc : proposedCombination) {
            if (!super.colorsToString().contains(Character.toString(pc))) {
                return false;
            }
            iteration = 0;
            combinationString = new String(proposedCombination);
            character = Character.toString(pc);
            while (combinationString.indexOf(character) != -1) {
                combinationString = combinationString.substring(
                        combinationString.indexOf(character) + 1,
                        combinationString.length());
                iteration++;
            }
            if (iteration > 1) {
                return false;
            }
            if (super.getColors().length < proposedCombination.length
                    || proposedCombination.length != 4) {
                return false;
            }
        }
        return true;
    }

    /**
     * Method to calculate the result of the proposed combination
     * 
     * @param proposedCombination
     *            char array with the proposedCombination
     * @param proposedPlayer
     *            with the attemps
     * @return the result with the deaths and damaged
     */
    public Result calculateResult(char[] proposedCombination,
            ProposedPlayer proposedPlayer) {
        Result result = new Result();
        if (isValid(proposedCombination)) {
            for (int i = 0; i < proposedCombination.length; i++) {
                if (proposedCombination[i] == secretCombination[i]) {
                    result.setDeaths(result.getDeaths() + 1);
                } else {
                    for (char element : proposedCombination) {
                        if (secretCombination[i] == element) {
                            result.setDamaged(result.getDamaged() + 1);
                        }
                    }
                }
            }
            proposedPlayer.setAttempts(proposedPlayer.getAttempts() + 1);
        }
        return result;
    }

    /**
     * Method to return the proposed combination and the deaths and damaged
     * 
     * @param proposedCombination
     *            char array with the combination
     * @param result
     *            with the deaths and damaged
     * @return string to write on command line
     */
    public String write(char[] proposedCombination, Result result) {
        return new String(proposedCombination) + " --> " + result.getDeaths()
                + " blacks and " + result.getDamaged() + " whites";
    }
}
