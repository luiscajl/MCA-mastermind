package com.mca.mastermind;

import com.mca.mastermind.views.View;
import com.mca.mastermind.views.graphics.GraphicsView;

public class GraphicsMastermind extends Mastermind {

    @Override
    protected View createView() {
        return new GraphicsView();
    }

    public static void main(String[] args) {
        new GraphicsMastermind().play();
    }
}
