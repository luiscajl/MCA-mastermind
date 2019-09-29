package com.mca.mastermind.models;

public class Result {

    private int deads;

    private int damaged;

    public Result() {
        this.deads = 0;
        this.damaged = 0;
    }

    public void write(String combination) {
        System.out.println(combination + " --> " + deads + "deads " + damaged
                + " damaged.");
    }

    public boolean isWinner() {
        return deads >= 4;
    }

    public int getDeads() {
        return deads;
    }

    public int getDamaged() {
        return damaged;
    }

    public void setDeads(int deads) {
        this.deads = deads;
    }

    public void setDamaged(int damaged) {
        this.damaged = damaged;
    }
}
