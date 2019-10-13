package com.mca.mastermind.views.menus;

import java.io.IOException;
import com.mca.mastermind.controllers.StartController;
import com.mca.mastermind.utils.Menu;

public class GameSelectMenu extends Menu {

    public GameSelectMenu(StartController startController) throws IOException {
        startController.getGamesNames().forEach(names -> this
                .addCommand(new GameSelectCommand(names, startController)));
    }
}
