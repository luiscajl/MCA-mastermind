package com.mca.mastermind.models;

/**
 * Class to control the result of the player
 * 
 * @author luisca
 *
 */
public class Result {

    private int deaths;

    private int damaged;

    /**
     * Constructor
     */
    public Result() {
        deaths = 0;
        damaged = 0;
    }

    /**
     * Constrcutor with arguments
     * 
     * @param deaths
     *            number of deaths
     * @param damaged
     *            number of damaged
     */
    public Result(int deaths, int damaged) {
        this.deaths = deaths;
        this.damaged = damaged;
    }

    /**
     * Method to get the deaths of the player
     * 
     * @return int deaths
     */
    public int getDeaths() {
        return deaths;
    }

    /**
     * Method to get the damaged of the player
     * 
     * @return int damaged
     */
    public int getDamaged() {
        return damaged;
    }

    /**
     * Method to set the deaths
     * 
     * @param deaths
     *            int to set on the attribute
     */
    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    /**
     * Method to set the damaged
     * 
     * @param damaged
     *            into set on the attribute
     */
    public void setDamaged(int damaged) {
        this.damaged = damaged;
    }
}
