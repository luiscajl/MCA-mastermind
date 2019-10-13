package com.mca.mastermind.controllers;

import java.util.HashMap;
import java.util.Map;
import com.mca.mastermind.models.Session;
import com.mca.mastermind.models.StateValue;

public class Logic {

    protected Session session;

    protected Map<StateValue, GameController> gameControllers;

    protected Logic() {
        gameControllers = new HashMap<StateValue, GameController>();
    }

    public GameController getController() {
        return gameControllers.get(this.session.getValueState());
    }
}
