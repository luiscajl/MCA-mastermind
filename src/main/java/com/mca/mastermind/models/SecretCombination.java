package com.mca.mastermind.models;

import java.util.Collections;
import java.util.Random;

/**
 * Class of the secret combination of mastermind. Son of Combination
 * 
 * @author luisca
 *
 */
public class SecretCombination extends Combination {

    SecretCombination() {
        for (Color color : Color.values()) {
            this.colors.add(color);
        }
        Random random = new Random(System.currentTimeMillis());
        final int erased = colors.size() - Combination.getWidth();
        for (int i = 0; i < erased; i++) {
            this.colors.remove(random.nextInt(this.colors.size()));
        }
        Collections.shuffle(this.colors);
    }

    Result getResult(ProposedCombination proposedCombination) {
        int blacks = 0;
        for (int i = 0; i < this.colors.size(); i++) {
            if (proposedCombination.contains(this.colors.get(i), i)) {
                blacks++;
            }
        }
        int whites = 0;
        for (Color color : this.colors) {
            if (proposedCombination.contains(color)) {
                whites++;
            }
        }
        return new Result(blacks, whites - blacks);
    }
}
