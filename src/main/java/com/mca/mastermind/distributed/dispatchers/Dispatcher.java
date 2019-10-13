package com.mca.mastermind.distributed.dispatchers;

import java.io.IOException;
import com.mca.mastermind.controllers.AcceptorController;

public abstract class Dispatcher {

    protected AcceptorController acceptorController;

    protected TCPIP tcpip;

    public Dispatcher(AcceptorController acceptorController) {
        this.acceptorController = acceptorController;
    }

    public abstract void dispatch() throws IOException;

    public void associate(TCPIP tcpip) {
        this.tcpip = tcpip;
    }
}
