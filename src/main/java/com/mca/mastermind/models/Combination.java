package com.mca.mastermind.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination {

    final int NUM_MAX_CHARACTER = 4;

    private List<Color> colorCombination;

    Combination() {
        getRandomCombination();
    }

    public List<Color> getRandomCombination() {
        colorCombination = new ArrayList<Color>(NUM_MAX_CHARACTER);
        colorCombination = Arrays.asList(Color.values());
        return colorCombination;
    }
}
