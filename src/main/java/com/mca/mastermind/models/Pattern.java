package com.mca.mastermind.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pattern {

    private static final int PATTERN_LENGTH = 4;

    private Color[] colors;

    public Pattern() {
        colors = new Color[PATTERN_LENGTH];
    }

    public static int getPatternLength() {
        return PATTERN_LENGTH;
    }

    public Color[] getColors() {
        return colors;
    }

    public void setColors(Color[] colors) {
        this.colors = colors;
    }

    public Result compareTo(Pattern pattern) {
        assert (pattern != null);
        if (this.equals(pattern)) {
            return new Result(4, 0);
        }
        List<Color>[] colorsLeft = new List[]{new ArrayList<Color>(),
                new ArrayList<Color>()};
        int blackPegs = 0;
        for (int i = 0; i < PATTERN_LENGTH; i++) {
            if (this.colors[i].equals(pattern.colors[i])) {
                blackPegs++;
            } else {
                colorsLeft[0].add(this.colors[i]);
                colorsLeft[1].add(pattern.colors[i]);
            }
        }
        int whitePegs = 0;
        for (Color color : colorsLeft[0]) {
            if (colorsLeft[1].contains(color)) {
                whitePegs++;
                colorsLeft[1].remove(color);
            }
        }
        return new Result(blackPegs, whitePegs);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Pattern)) {
            return false;
        }
        Pattern pattern = (Pattern) o;
        return Arrays.equals(colors, pattern.colors);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(colors);
    }

    @Override
    public String toString() {
        return "Pattern{" + "colors=" + Arrays.toString(colors) + '}';
    }
}
