package com.mca.mastermind.controllers;

import com.mca.mastermind.models.Session;

public abstract class Controller {

    protected Session session;

    public Controller(Session session) {
        this.session = session;
    }

    public int getWidth() {
        return session.getWidth();
    }

    public abstract void control();
}
