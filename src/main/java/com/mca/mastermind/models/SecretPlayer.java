package com.mca.mastermind.models;

public class SecretPlayer {
  SecretCombination secretCombination = new SecretCombination();
  ProposedPlayer proposedPlayer;

  public void prepare() {
    this.secretCombination.setSecretCombination(secretCombination.genSecretCombination());
  }

  public Result answer(char[] proposedCombination) {
    return secretCombination.calculateResult(proposedCombination, this.secretCombination.getSecretCombination(), proposedPlayer);
  }

  public void write(char[] proposedCombination, Result result) {
    if (secretCombination.isValid(proposedCombination)) {
      proposedPlayer.writeProposedCombinations(secretCombination.write(proposedCombination, result));
    }
  }

  public void setProposerPlayer(ProposedPlayer proposerPlayer) {
    proposerPlayer = proposerPlayer;
  }

  public void writeEncode() {
    for (int i = 0; i < 4; i++) {
      System.out.println("*");
    }
    System.out.print('\n');
  }
}
