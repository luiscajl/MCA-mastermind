package com.mca.mastermind.models;

import java.util.ArrayList;
import java.util.List;
import com.mca.mastermind.commands.PlayCommand;
import com.mca.mastermind.utils.ClosedInterval;
import com.mca.mastermind.utils.WithConsoleView;

public abstract class Menu extends WithConsoleView {

    private static final String OPTION = "----- Choose one option -----";

    private List<PlayCommand> commandList;

    public Menu() {
        this.commandList = new ArrayList<PlayCommand>();
    }

    public void execute() {
        List<PlayCommand> commands = new ArrayList<PlayCommand>();
        for (PlayCommand element : commandList) {
            if (element.isActive()) {
                commands.add(element);
            }
        }
        boolean error;
        int option;
        do {
            error = false;
            console.writeln();
            console.writeln(Menu.OPTION);
            commands.forEach(command -> console.writeln(
                    (command.getNumber()) + ") " + command.getTitle()));
            option = this.console.readInt() - 1;
            if (!new ClosedInterval(0, commands.size() - 1).includes(option)) {
                error = true;
            }
        } while (error);
        commands.get(option).execute();
    }

    protected void addCommand(PlayCommand command) {
        commandList.add(command);
    }
}
