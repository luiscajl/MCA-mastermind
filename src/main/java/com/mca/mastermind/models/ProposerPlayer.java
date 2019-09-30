package com.mca.mastermind.models;

public class ProposerPlayer {
  int attempts = 0;
  boolean endgame = false;
  ProposedCombination proposedCombination = new ProposedCombination();
  String proposedCombinations = "";

  public char[] propose() {
    this.proposedCombination.setProposedCombination(proposedCombination.read());
    return this.proposedCombination.getProposedCombination();
  }

  public char[] getLastPropose() {
    return this.proposedCombination.getProposedCombination();
  }

  public void writeAttempts() {
    System.out.println(this.attempts + " attempts(s): ");
  }

  public void setProposedCombinations(String combination) {
    this.proposedCombinations = combination;
  }

  void writeProposedCombinations(String combination) {
    this.proposedCombinations += combination + "\n";
    System.out.println(this.proposedCombinations);
  }

  public void isWinner() {
    System.out.println(" You've won!!! ;-)");
  }

  public void isLooser() {
    System.out.println(" You've lost!!! :-(");
  }

  public void setAttempts(int attempts) {
    this.attempts = attempts;
    if (this.attempts >= 10) {
      this.endgame = true;
    }
  }

  int getAttempts() {
    return attempts;
  }

  public void setEndGame(boolean endgame) {
    this.endgame = endgame;
  }

  public boolean getEndGame() {
    return this.endgame;
  }
}
