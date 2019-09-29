package com.mca.mastermind.models;

import java.util.Scanner;
import com.mca.mastermind.utils.MastermindConstants;

/**
 * Class for proposed player combination
 * 
 * @author luisca
 *
 */
public class ProposedCombination extends Combination {

    private Scanner scanner;

    private char[] proposedCombination;

    /**
     * Constructor
     */
    public ProposedCombination() {
        super();
        scanner = new Scanner(System.in);
    }

    /**
     * Method to read the command line
     * 
     * @return char array with the content of scanner command line
     */
    public char[] read() {
        System.out.print(MastermindConstants.PROPOSE_COMBINATION);
        return scanner.nextLine().toCharArray();
    }

    /**
     * Method to set
     * 
     * @param proposedCombination
     *            the setter
     */
    public void setProposedCombination(char[] proposedCombination) {
        this.proposedCombination = proposedCombination;
    }

    /**
     * Method to get the proposed combination
     * 
     * @return char array with the private proposed combination atribute
     */
    public char[] getProposedCombination() {
        return proposedCombination;
    }
}
