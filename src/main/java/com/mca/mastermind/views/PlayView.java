package com.mca.mastermind.views;

import com.mca.mastermind.controllers.PlayController;

public class PlayView {

    void interact(PlayController playController) {
        new PlayMenu(playController).execute();
    }
}
