package com.mca.mastermind.controllers;

import java.util.HashMap;
import java.util.Map;
import com.mca.mastermind.models.Game;
import com.mca.mastermind.models.State;
import com.mca.mastermind.models.StateValue;

public class Logic {

    private final State state;

    private Game game;

    private Map<StateValue, Controller> controllers;

    public Logic() {
        state = new State();
        game = new Game();
        fillMap();
    }

    private void fillMap() {
        controllers = new HashMap<>();
        controllers.put(StateValue.INITIAL, new StartController(game, state));
        controllers.put(StateValue.IN_GAME,
                new ProposeCombinationController(game, state));
        controllers.put(StateValue.FINAL, new ResumeController(game, state));
        controllers.put(StateValue.EXIT, null);
    }

    public Controller getController() {
        return this.controllers.get(this.state.getValueState());
    }
}
