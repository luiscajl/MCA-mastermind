package com.mca.mastermind.models;

import java.util.List;

/**
 * Class for proposed player combination
 * 
 * @author luisca
 *
 */
public class ProposedCombination extends Combination {

    /**
     * Constructor
     */
    public ProposedCombination() {
        super();
    }

    public ProposedCombination(List<Color> listColors) {
        this.colors = listColors;
    }

    /**
     * Method to set
     * 
     * @param proposedCombination
     *            the setter
     */
    public void setProposedCombination(List<Color> proposedCombination) {
        this.colors = proposedCombination;
    }

    /**
     * Method to get the proposed combination
     * 
     * @return List with the private proposed combination atribute
     */
    public List<Color> getProposedCombination() {
        return colors;
    }

    boolean contains(Color color, int position) {
        return colors.get(position) == color;
    }

    boolean contains(Color color) {
        for (Color element : colors) {
            if (element == color) {
                return true;
            }
        }
        return false;
    }
}
