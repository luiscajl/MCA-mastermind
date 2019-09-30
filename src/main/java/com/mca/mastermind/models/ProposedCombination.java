package com.mca.mastermind.models;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.mca.mastermind.utils.MastermindUtils;

public class ProposedCombination extends Combination {
  private MastermindUtils mastermindUtils;

  public ProposedCombination() {
    mastermindUtils = new MastermindUtils();
  }

  void read() {
    System.out.print("Propose a combination:");
    String readedCombination = mastermindUtils.readLine();
    List<Character> listColors = new ArrayList<Character>();
    for (char ch : readedCombination.toCharArray()) {
      listColors.add(ch);
    }
    if (isLengthOk(listColors) && !isWrongColors(listColors) && !repeatColors(listColors)) {
      System.out.println("Continueeee");
    } else {
      read();
    }
  }

  public boolean contains(Color color, int position) {
    return true;
  }

  public boolean contains(Color color) {
    return true;
  }

  public void set(Result result) {}

  public void isWinner() {}

  public boolean repeatColors(List<Character> listColors) {
    if (listColors.stream()
                  .distinct()
                  .collect(Collectors.toList())
                  .size() != listColors.size()) {
      System.out.println("Repeated colors");
      return true;
    } else {
      return false;
    }
  }

  /**
   * Method not Finished
   * 
   * @param listColors
   * @return
   */
  public boolean isWrongColors(List<Character> listColors) {
    return false;
  }

  public boolean isLengthOk(List<Character> listColors) {
    if (listColors.size() != 4) {
      System.out.println("Wrong proposed combination length(only 4)");
      return false;
    }
    return true;
  }
}
