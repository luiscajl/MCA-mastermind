package com.mca.mastermind.models;

public class ProposedPlayer {
  private ProposedCombination proposedCombination;
  private int attemps;
  private int maxAttemps;

  public ProposedPlayer(int maxAttemps) {
    this.maxAttemps = maxAttemps;
    this.attemps = 0;
    this.proposedCombination = new ProposedCombination();
  }

  public void propose() {
    proposedCombination.read();
  }

  ProposedPlayer getLastProposedPlayer() {
    return this;
  }

  public void writeAttemps() {
    System.out.println(attemps + " attempt(s)");
  }

  public boolean isWinner() {
    return false;
  }

  public boolean isLooser() {
    return attemps == maxAttemps;
  }

  public ProposedCombination getProposedCombination() {
    return proposedCombination;
  }

  public void setProposedCombination(ProposedCombination proposedCombination) {
    this.proposedCombination = proposedCombination;
  }

  public int getAttemps() {
    return attemps;
  }

  public void setAttemps(int attemps) {
    this.attemps = attemps;
  }
}
