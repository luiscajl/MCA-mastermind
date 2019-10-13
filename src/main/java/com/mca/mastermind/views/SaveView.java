package com.mca.mastermind.views;

import java.io.IOException;
import com.mca.mastermind.controllers.SaveController;
import com.mca.mastermind.utils.WithConsoleView;
import com.mca.mastermind.utils.YesNoDialog;
import com.mca.mastermind.views.models.MessageView;

class SaveView extends WithConsoleView {

    void interact(SaveController saveController) throws IOException {
        boolean save = new YesNoDialog().read(MessageView.SAVE.getMessage());
        String name = null;
        if (save) {
            if (saveController.hasName()) {
                saveController.save();
            } else {
                boolean exists = false;
                do {
                    name = this.console
                            .readString(MessageView.NAME.getMessage());
                    exists = saveController.exists(name);
                    if (exists) {
                        this.console
                                .writeln("The proposed name already exists");
                    }
                } while (exists);
                saveController.save(name);
            }
        }
        saveController.next();
    }
}
