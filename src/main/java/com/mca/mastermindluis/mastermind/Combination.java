package com.mca.mastermindluis.mastermind;

import java.util.ArrayList;
import java.util.List;
import com.mca.mastermindluis.santaTecla.utils.WithConsoleModel;

abstract class Combination extends WithConsoleModel {

    private static final int WIDTH = 4;

    protected List<Color> colors;

    protected Combination() {
        this.colors = new ArrayList<Color>();
    }

    static int getWidth() {
        return Combination.WIDTH;
    }
}
