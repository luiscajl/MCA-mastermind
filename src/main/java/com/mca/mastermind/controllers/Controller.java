package com.mca.mastermind.controllers;

import com.mca.mastermind.models.Session;

public abstract class Controller {

    protected Session session;

    Controller(Session session) {
        this.session = session;
    }

    public int getWidth() {
        return this.session.getWidth();
    }
}
