package com.mca.mastermind;

import java.util.Scanner;

import com.mca.mastermind.models.ProposedPlayer;
import com.mca.mastermind.models.Result;
import com.mca.mastermind.models.SecretPlayer;

public class Mastermind {
  private final int MAX_ATTEMPS = 10;
  private SecretPlayer secretPlayer;
  private ProposedPlayer proposedPlayer;

  public static void main(String[] args) {
    Mastermind mastermind = new Mastermind();
    Scanner input = new Scanner(System.in);
    String option = "";
    do {
      mastermind.play();
      System.out.println("\tDo you want to continue? (s/n):");
      option = input.nextLine();
    } while (!option.toLowerCase()
                    .equals("n"));
    input.close();
  }

  /**
   * Method not finished
   */
  void play() {
    Result result = null;
    System.out.println("----- MASTERMIND -----\n****");
    proposedPlayer = new ProposedPlayer(MAX_ATTEMPS);
    secretPlayer = new SecretPlayer(proposedPlayer);
    secretPlayer.prepare();
    do {
      result = new Result();
      proposedPlayer.propose();
      proposedPlayer.writeAttemps();
    } while (true);
  }
}
