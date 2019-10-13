package com.mca.mastermind.controllers;

import java.io.IOException;
import com.mca.mastermind.models.Session;

public abstract class SaveController extends AcceptorController {

    public SaveController(Session session) {
        super(session);
    }

    public abstract void save(String name);

    public abstract void save();

    public abstract void next();

    public abstract boolean hasName();

    public abstract boolean exists(String readString) throws IOException;

    @Override
    public void accept(ControllersVisitor controllersVisitor)
            throws IOException {
        controllersVisitor.visit(this);
    }
}
