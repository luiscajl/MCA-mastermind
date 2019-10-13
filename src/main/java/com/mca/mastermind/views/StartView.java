package com.mca.mastermind.views;

import java.io.IOException;
import com.mca.mastermind.controllers.StartController;
import com.mca.mastermind.views.menus.StartMenu;
import com.mca.mastermind.views.models.GameView;
import com.mca.mastermind.views.models.MessageView;

class StartView {

    void interact(StartController startController) throws IOException {
        MessageView.TITLE.writeln();
        new StartMenu(startController).execute();
        new GameView(startController).writeln();
    }
}
