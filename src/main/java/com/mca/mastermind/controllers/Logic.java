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
        this.state = new State();
        this.game = new Game();
        this.controllers = new HashMap<>();
        this.controllers.put(StateValue.INITIAL,
                new StartController(this.game, this.state));
        this.controllers.put(StateValue.IN_GAME,
                new ProposeCombinationController(this.game, this.state));
        this.controllers.put(StateValue.FINAL,
                new ResumeController(this.game, this.state));
        this.controllers.put(StateValue.EXIT, null);
    }

    public Controller getController() {
        return this.controllers.get(this.state.getValueState());
    }
}
