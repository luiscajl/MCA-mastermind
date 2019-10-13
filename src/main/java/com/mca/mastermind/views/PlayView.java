package com.mca.mastermind.views;

import java.io.IOException;
import com.mca.mastermind.controllers.PlayController;
import com.mca.mastermind.views.menus.PlayMenu;
import com.mca.mastermind.views.models.GameView;

class PlayView {

    void interact(PlayController playController) throws IOException {
        new PlayMenu(playController).execute();
        new GameView(playController).writeln();
    }
}
