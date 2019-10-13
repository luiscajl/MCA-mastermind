package com.mca.mastermind.views;

import java.io.IOException;
import com.mca.mastermind.controllers.AcceptorController;
import com.mca.mastermind.controllers.ControllersVisitor;
import com.mca.mastermind.controllers.PlayController;
import com.mca.mastermind.controllers.ResumeController;
import com.mca.mastermind.controllers.SaveController;
import com.mca.mastermind.controllers.StartController;

public class View implements ControllersVisitor {

    private StartView startView;

    private PlayView playView;

    private SaveView saveView;

    private ResumeView resumeView;

    public View() {
        this.startView = new StartView();
        this.playView = new PlayView();
        this.saveView = new SaveView();
        this.resumeView = new ResumeView();
    }

    public void interact(AcceptorController acceptorController)
            throws IOException {
        acceptorController.accept(this);
    }

    @Override
    public void visit(StartController startController) throws IOException {
        this.startView.interact(startController);
    }

    @Override
    public void visit(PlayController playController) throws IOException {
        this.playView.interact(playController);
    }

    @Override
    public void visit(SaveController saveController) throws IOException {
        this.saveView.interact(saveController);
    }

    @Override
    public void visit(ResumeController resumeController) {
        this.resumeView.interact(resumeController);
    }
}
