package com.mca.mastermind.controllers;

import java.io.IOException;
import com.mca.mastermind.models.Session;

public abstract class AcceptorController extends Controller {

    AcceptorController(Session session) {
        super(session);
    }

    public abstract void accept(ControllersVisitor controllersVisitor)
            throws IOException;
}
