package com.mca.mastermind.views.graphics;

import com.mca.mastermind.controllers.ProposalController;
import com.mca.mastermind.controllers.ResumeController;
import com.mca.mastermind.controllers.StartController;
import com.mca.mastermind.views.View;

public class GraphicsView extends View {

    private GameView gameView;

    public GraphicsView() {
        this.gameView = new GameView();
    }

    @Override
    public void visit(StartController startController) {
        this.gameView.interact(startController);
    }

    @Override
    public void visit(ProposalController proposalController) {
        this.gameView.interact(proposalController);
    }

    @Override
    public void visit(ResumeController resumeController) {
        ResumeDialog resumeDialog = new ResumeDialog();
        resumeController.resume(resumeDialog.isNewGame());
        if (resumeDialog.isNewGame()) {
            this.gameView = new GameView();
        } else {
            this.gameView.setVisible(false);
            System.exit(0);
        }
    }
}
