package com.mca.mastermind.views.graphics;

import javax.swing.JOptionPane;
import com.mca.mastermind.views.MessageView;

class ResumeDialog {

    private boolean newGame;

    ResumeDialog() {
        this.newGame = (JOptionPane.showConfirmDialog(null,
                MessageView.RESUME.getMessage(), MessageView.TITLE.getMessage(),
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);
    }

    boolean isNewGame() {
        return this.newGame;
    }
}
