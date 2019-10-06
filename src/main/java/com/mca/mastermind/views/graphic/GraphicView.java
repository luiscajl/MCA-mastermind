package com.mca.mastermind.views.graphic;

import com.mca.mastermind.controllers.Controller;
import com.mca.mastermind.controllers.ProposeCombinationController;
import com.mca.mastermind.controllers.ResumeController;
import com.mca.mastermind.controllers.StartController;
import com.mca.mastermind.views.View;

public class GraphicView extends View {

    @Override
    public void interact(Controller controller) {
        controller.accept(this);
    }

    @Override
    public void visit(StartController startController) {
        startController.start();
    }

    @Override
    public void visit(ResumeController resumeController) {
    }

    @Override
    public void visit(
            ProposeCombinationController proposeCombinationController) {
    }
}
