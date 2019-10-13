package com.mca.mastermind.controllers;

import java.io.IOException;
import java.util.List;
import com.mca.mastermind.models.Session;

public abstract class StartController extends GameController {

    public StartController(Session session) {
        super(session);
    }

    public abstract void start();

    public abstract void start(String title);

    public abstract List<String> getGamesNames() throws IOException;

    @Override
    public void accept(ControllersVisitor controllersVisitor)
            throws IOException {
        controllersVisitor.visit(this);
    }
}
