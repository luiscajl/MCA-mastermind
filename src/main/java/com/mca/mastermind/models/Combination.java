package com.mca.mastermind.models;

/**
 * Class for combination of colors enum
 * 
 * @author luisca
 *
 */
public class Combination {

    private Color[] colors;

    /**
     * Constructor
     */
    public Combination() {
        colors = Color.values();
    }

    /**
     * Method to convert color enum to string
     * 
     * @return string with the colors
     */
    public String colorsToString() {
        String enumString = "";
        for (Color c : Color.values()) {
            enumString += c.toString();
        }
        return enumString;
    }

    /**
     * Method to return the colors attribute
     * 
     * @return colors enum attribute
     */
    public Color[] getColors() {
        return colors;
    }
}
