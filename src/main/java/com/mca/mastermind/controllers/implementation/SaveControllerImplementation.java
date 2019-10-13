package com.mca.mastermind.controllers.implementation;

import java.io.IOException;
import com.mca.mastermind.controllers.SaveController;
import com.mca.mastermind.models.Session;
import com.mca.mastermind.models.SessionImplementation;
import com.mca.mastermind.models.DAO.SessionImplementationDAO;

public class SaveControllerImplementation extends SaveController {

    private SessionImplementationDAO sessionImplementationDAO;

    SaveControllerImplementation(Session session,
            SessionImplementationDAO sessionImplementationDAO) {
        super(session);
        this.sessionImplementationDAO = sessionImplementationDAO;
    }

    @Override
    public void save(String name) {
        this.sessionImplementationDAO.save(name);
    }

    @Override
    public void save() {
        this.sessionImplementationDAO.save();
    }

    @Override
    public void next() {
        ((SessionImplementation) this.session).next();
    }

    @Override
    public boolean hasName() {
        return ((SessionImplementation) this.session).hasName();
    }

    @Override
    public boolean exists(String name) throws IOException {
        return this.sessionImplementationDAO.exists(name);
    }
}
