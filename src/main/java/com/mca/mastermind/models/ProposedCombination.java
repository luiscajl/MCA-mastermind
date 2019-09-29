package com.mca.mastermind.models;

import java.util.ArrayList;
import java.util.List;
import com.mca.mastermind.utils.MastermindUtils;

public class ProposedCombination extends Combination {

    private MastermindUtils mastermindUtils;

    public ProposedCombination proposedCombination;

    void read() {
        String readedCombination = mastermindUtils.readLine();
        List<Character> listColors= new ArrayList<Character>();
        for (char ch : readedCombination.toCharArray()) { 
            listColors.add(ch); 
        } 
        if (!isWrongColors(listColors))
    }

    public boolean contains(Color color, int position) {
        return true;
    }

    public boolean contains(Color color) {
        return true;
    }

    public void set(Result result) {
    }

    public void isWinner() {
    }

    public boolean repeatColors(String combination) {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean isWrongColors(List<Character> listColors) {
        for (Character character : listColors) {
            Color.values().
            if (Color.valueOf(String.valueOf(character)) ) {
                Color.valueOf(arg0);
            }
        }
    }

    public boolean isLengthOk(List<Character> listColors) {
        if (listColors.size() != 4) {
            System.out.println("Wrong proposed combination length(only 4)");
            return false;
        }
        return true;
    }
}
