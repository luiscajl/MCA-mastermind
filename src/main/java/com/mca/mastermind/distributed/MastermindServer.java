package com.mca.mastermind.distributed;

import java.io.IOException;
import com.mca.mastermind.distributed.dispatchers.DispatcherPrototype;
import com.mca.mastermind.models.DAO.SessionImplementationDAO;

public class MastermindServer {

    private DispatcherPrototype dispatcherPrototype;

    private LogicImplementationServer logic;

    private MastermindServer() {
        this.dispatcherPrototype = new DispatcherPrototype();
        this.logic = new LogicImplementationServer(
                new SessionImplementationDAO());
        this.logic.createDispatchers(this.dispatcherPrototype);
    }

    private void serve() throws IOException {
        this.dispatcherPrototype.serve();
    }

    public static void main(String[] args) throws IOException {
        new MastermindServer().serve();
    }
}
