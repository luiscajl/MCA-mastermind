package com.mca.mastermind;

import com.mca.mastermind.controllers.Controller;
import com.mca.mastermind.controllers.Logic;
import com.mca.mastermind.utils.MastermindIO;
import com.mca.mastermind.utils.MastermindMessages;
import com.mca.mastermind.views.View;
import com.mca.mastermind.views.console.ConsoleView;
import com.mca.mastermind.views.graphic.GraphicView;

/**
 * Main Class
 * 
 * @author luisca
 *
 */
public class Mastermind {

    private Logic logic;

    private View view;

    /**
     * Main
     * 
     * @param args
     */
    public static void main(String[] args) {
        new Mastermind(selectView()).play();
    }

    /**
     * Private constructor
     * 
     * @param view
     *            the selected view
     */
    private Mastermind(int view) {
        this.logic = new Logic();
        switch (view) {
            case 1 : {
                this.view = new ConsoleView();
                break;
            }
            case 2 : {
                this.view = new GraphicView();
                break;
            }
            default :
                this.logic = null;
        }
    }

    /**
     * Method to start the game
     */
    public void play() {
        if (logic != null) {
            Controller controller;
            do {
                controller = logic.getController();
                view.interact(controller);
            } while (controller != null);
        }
    }

    /**
     * Method to select the view
     * 
     * @return int 1, console view, 2 graphics view, exit eoc
     */
    private static int selectView() {
        MastermindIO.writeln(MastermindMessages.CONTEXT_MENU);
        return MastermindIO.readInt();
    }
}
