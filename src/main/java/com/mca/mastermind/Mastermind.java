package com.mca.mastermind;

import com.mca.mastermind.controllers.ProposalController;
import com.mca.mastermind.controllers.ResumeController;
import com.mca.mastermind.controllers.StartController;
import com.mca.mastermind.models.Session;
import com.mca.mastermind.views.View;

public abstract class Mastermind {

    private Session session;

    private StartController startController;

    private ProposalController proposalController;

    private ResumeController resumeController;

    private View view;

    protected Mastermind() {
        this.session = new Session();
        this.startController = new StartController(this.game);
        this.proposalController = new ProposalController(this.game);
        this.resumeController = new ResumeController(this.game);
        this.view = this.createView(this.startController,
                this.proposalController, this.resumeController);
    }

    protected abstract View createView(StartController startController,
            ProposalController proposalController,
            ResumeController resumeController);

    /**
     * El metodo play tiene que hacer uso de
     * controllers.getSession.getValue().control()
     */
    protected void play() {
        this.view.interact();
    }
}
