package com.mca.mastermind.models;

import java.util.List;
import com.mca.mastermind.types.Color;

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
}
