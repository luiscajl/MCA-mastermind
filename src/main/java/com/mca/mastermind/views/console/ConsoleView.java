package com.mca.mastermind.views.console;

import com.mca.mastermind.controllers.Controller;
import com.mca.mastermind.controllers.ProposeCombinationController;
import com.mca.mastermind.controllers.ResumeController;
import com.mca.mastermind.controllers.StartController;
import com.mca.mastermind.views.View;
import klondike.utils.YesNoDialog;
import klondike.views.console.GameView;
import klondike.views.console.Message;
import klondike.views.console.menu.PlayMenu;

public class ConsoleView implements View {

    @Override
    public void interact(Controller controller) {
        controller.accept(this);
    }

    @Override
    public void visit(StartController startController) {
        startController.start();
        new GameView(startController).writeln();
    }

    @Override
    public void visit(
            ProposeCombinationController proposeCombinationController) {
        new PlayMenu(proposeCombinationController).execute();
        new GameView(proposeCombinationController).writeln();
    }

    @Override
    public void visit(ResumeController resumeController) {
        resumeController.resume(new YesNoDialog().read(Message.RESUME));
    }
}
