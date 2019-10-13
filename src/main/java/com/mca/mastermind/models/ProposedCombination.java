package com.mca.mastermind.models;

import java.util.ArrayList;
import java.util.List;

class ProposedCombination extends Combination {

    ProposedCombination(List<Color> colors) {
        this.colors = colors;
    }

    boolean contains(Color color, int position) {
        return this.colors.get(position) == color;
    }

    boolean contains(Color color) {
        for (Color element : this.colors) {
            if (element == color) {
                return true;
            }
        }
        return false;
    }

    public ProposedCombination copyCombination() {
        List<Color> colors = new ArrayList<Color>();
        for (Color color : this.colors) {
            colors.add(color);
        }
        return new ProposedCombination(colors);
    }
}
