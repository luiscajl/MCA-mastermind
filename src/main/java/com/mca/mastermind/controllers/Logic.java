package com.mca.mastermind.controllers;

import java.util.HashMap;
import java.util.Map;
import com.mca.mastermind.models.Session;
import com.mca.mastermind.models.StateValue;

public class Logic {

    private Session session;

    private Map<StateValue, GameController> gameControllers;

    public Logic() {
        this.session = new Session();
        this.gameControllers = new HashMap<StateValue, GameController>();
        this.gameControllers.put(StateValue.INITIAL,
                new StartController(this.session));
        this.gameControllers.put(StateValue.IN_GAME,
                new PlayController(this.session));
        this.gameControllers.put(StateValue.FINAL,
                new ResumeController(this.session));
        this.gameControllers.put(StateValue.EXIT, null);
    }

    public GameController getController() {
        return this.gameControllers.get(this.session.getValueState());
    }
}
