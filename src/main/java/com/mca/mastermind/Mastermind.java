package com.mca.mastermind;

import java.util.HashMap;
import java.util.Map;
import com.mca.mastermind.controllers.Controller;
import com.mca.mastermind.controllers.ProposalController;
import com.mca.mastermind.controllers.ResumeController;
import com.mca.mastermind.controllers.StartController;
import com.mca.mastermind.models.Session;
import com.mca.mastermind.models.StateValue;

public class Mastermind {

    private Session session;

    private Map<StateValue, Controller> controllers;

    public static void main(String[] args) {
        new Mastermind().play();
    }

    protected Mastermind() {
        session = new Session();
        controllers = new HashMap<StateValue, Controller>();
        controllers.put(StateValue.INITIAL, new StartController(this.session));
        controllers.put(StateValue.IN_GAME,
                new ProposalController(this.session));
        controllers.put(StateValue.FINAL, new ResumeController(this.session));
        controllers.put(StateValue.EXIT, null);
    }

    /**
     * El metodo play tiene que hacer uso de
     * controllers.getSession.getValue().control()
     */
    void play() {
        Controller controller;
        do {
            controller = this.controllers.get(this.session.getValueState());
            if (controller != null) {
                controller.control();
            }
        } while (controller != null);
    }
}
