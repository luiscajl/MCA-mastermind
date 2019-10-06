package com.mca.mastermind.views.console;

import com.mca.mastermind.controllers.ProposeCombinationController;
import com.mca.mastermind.controllers.ResumeController;
import com.mca.mastermind.controllers.StartController;
import com.mca.mastermind.views.ProposeCombinationView;
import com.mca.mastermind.views.ResumeView;
import com.mca.mastermind.views.StartView;
import com.mca.mastermind.views.View;

public class ConsoleView extends View {

    @Override
    public void visit(StartController startController) {
        new StartView().interact(startController);
    }

    @Override
    public void visit(
            ProposeCombinationController proposeCombinationController) {
        new ProposeCombinationView().interact(proposeCombinationController);
    }

    @Override
    public void visit(ResumeController resumeController) {
        new ResumeView().interact(resumeController);
    }
}
