package com.mca.mastermind.views.console;

import java.util.ArrayList;
import java.util.List;
import com.mca.mastermind.types.Color;
import com.mca.mastermind.utils.WithConsoleView;
import com.mca.mastermind.views.MessageView;

public class ProposedCombinationView extends WithConsoleView {

    void write(List<Color> colors) {
        colors.forEach(color -> new ColorView(color).write());
    }

    public List<Color> read() {
        String characters = this.console
                .readString(MessageView.PROPOSED_COMBINATION.getMessage());
        List<Color> colors = new ArrayList<Color>();
        for (int i = 0; i < characters.length(); i++) {
            colors.add(ColorView.getInstance(characters.charAt(i)));
        }
        return colors;
    }
}
