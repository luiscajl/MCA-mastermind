package com.mca.mastermind.views.console;

import com.mca.mastermind.utils.YesNoDialog;
import com.mca.mastermind.views.MessageView;

public class ResumeView {

    public boolean write() {
        return new YesNoDialog().read(MessageView.RESUME.getMessage());
    }
}
