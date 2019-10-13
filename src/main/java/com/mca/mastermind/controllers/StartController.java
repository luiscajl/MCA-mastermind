package com.mca.mastermind.controllers;

import com.mca.mastermind.models.Session;

public class StartController extends GameController {

    public StartController(Session session) {
        super(session);
    }

    public void start() {
        this.session.next();
    }

    @Override
    public void accept(ControllersVisitor controllersVisitor) {
        controllersVisitor.visit(this);
    }
}
