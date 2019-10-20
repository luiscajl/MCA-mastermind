package com.mca.mastermind.controllers;

import com.mca.mastermind.models.Session;
import com.mca.mastermind.views.console.StartView;

public class StartController extends Controller {

    public StartController(Session session) {
        super(session);
    }

    @Override
    public void control() {
        this.session.next();
        new StartView().write(this.getWidth());
    }
}
