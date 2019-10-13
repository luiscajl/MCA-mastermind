package com.mca.mastermind.distributed.dispatchers;

import java.io.IOException;
import com.mca.mastermind.controllers.implementation.SaveControllerImplementation;

public class ExistsDispatcher extends Dispatcher {

    public ExistsDispatcher(
            SaveControllerImplementation saveControllerImplementation) {
        super(saveControllerImplementation);
    }

    @Override
    public void dispatch() throws IOException {
        String name = this.tcpip.receiveLine();
        this.tcpip.send(((SaveControllerImplementation) this.acceptorController)
                .exists(name));
    }
}
