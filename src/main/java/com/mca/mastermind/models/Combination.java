package com.mca.mastermind.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Class for combination of colors enum
 * 
 * @author luisca
 *
 */
public class Combination {

    private static final int WIDTH = 4;

    protected List<Color> colors;

    /**
     * Constructor
     */
    protected Combination() {
        this.colors = new ArrayList<Color>();
    }

    /**
     * Constructor
     */
    public Combination(List<Color> colors) {
        this.colors = colors;
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
    public List<Color> getColors() {
        return colors;
    }

    public static int getWidth() {
        return Combination.WIDTH;
    }
}
