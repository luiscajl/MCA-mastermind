package com.mca.mastermind.views.console;

import com.mca.mastermind.controllers.ResumeController;
import com.mca.mastermind.views.MessageView;
import com.mca.santaTecla.utils.YesNoDialog;

class ResumeView {

    void interact(ResumeController resumeController) {
        resumeController.resume(
                new YesNoDialog().read(MessageView.RESUME.getMessage()));
    }
}
