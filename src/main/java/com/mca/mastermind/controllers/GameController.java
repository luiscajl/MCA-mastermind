package com.mca.mastermind.controllers;

import com.mca.mastermind.models.Session;

public abstract class GameController extends Controller {

    GameController(Session session) {
        super(session);
    }

    public abstract void accept(ControllersVisitor controllersVisitor);
}
