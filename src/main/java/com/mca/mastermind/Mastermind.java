package com.mca.mastermind;

import java.lang.ModuleLayer.Controller;
import com.mca.mastermind.controllers.Logic;
import com.mca.mastermind.views.ConsoleView;
import com.mca.mastermind.views.View;

/**
 * Main Class
 * 
 * @author luisca
 *
 */
public class Mastermind {

    private Logic logic;

    private View view;

    private Mastermind() {
        this.logic = new Logic();
        this.view = new ConsoleView();
    }

    public static void main(String[] args) {
        new Mastermind().play();
    }

    public void play() {
        Controller controller;
        do {
            controller = this.logic.getController();
            this.view.interact(controller);
        } while (controller != null);
    }
    //
    //
    // private SecretPlayer secretPlayer;
    //
    // private ProposedPlayer proposedPlayer;
    //
    // /**
    // * Main Method
    // *
    // * @param args
    // * command line arguments
    // */
    // public static void main(String[] args) {
    // Mastermind mastermind = new Mastermind();
    // Scanner input = new Scanner(System.in);
    // String option = null;
    // do {
    // mastermind.play();
    // System.out.println(MastermindConstants.WANNA_CONTINUE);
    // option = input.nextLine();
    // } while (!option.toLowerCase().equals("n"));
    // input.close();
    // }
    //
    // /**
    // * Method to start the game
    // */
    // private void play() {
    // Result result = null;
    // secretPlayer = new SecretPlayer();
    // proposedPlayer = new ProposedPlayer();
    // System.out.println(MastermindConstants.MASTERMIND);
    // System.out.println(MastermindConstants.ASTERISK);
    // proposedPlayer.setEndGame(false);
    // secretPlayer.setProposedPlayer(proposedPlayer);
    // secretPlayer.prepare();
    // do {
    // result = secretPlayer.answer(proposedPlayer.propose());
    // proposedPlayer.writeAttempts();
    // System.out.println(MastermindConstants.ASTERISK);
    // secretPlayer.write(proposedPlayer.getLastPropose(), result);
    // } while (result.getDeaths() != MastermindConstants.MAX_DEATHS
    // && !proposedPlayer.getEndGame());
    // if (result.getDeaths() == MastermindConstants.MAX_DEATHS) {
    // proposedPlayer.isWinner();
    // }
    // if (proposedPlayer.getEndGame()) {
    // proposedPlayer.isLooser();
    // }
    // }
}
