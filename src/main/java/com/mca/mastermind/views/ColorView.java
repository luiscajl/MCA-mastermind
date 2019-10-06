package com.mca.mastermind.views;

import com.mca.mastermind.models.Color;
import com.mca.mastermind.utils.MastermindIO;

public class ColorView {

    protected Color color;

    public ColorView(Color color) {
        this.color = color;
    }

    public static String allInitials() {
        return Color.allInitials();
    }

    public void write() {
        MastermindIO.write(ColorView.allInitials());
    }
}
