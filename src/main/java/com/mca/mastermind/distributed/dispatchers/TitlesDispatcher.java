package com.mca.mastermind.distributed.dispatchers;

import java.io.IOException;
import java.util.List;
import com.mca.mastermind.controllers.implementation.StartControllerImplementation;

public class TitlesDispatcher extends Dispatcher {

    public TitlesDispatcher(
            StartControllerImplementation startControllerImplementation) {
        super(startControllerImplementation);
    }

    @Override
    public void dispatch() throws IOException {
        List<String> names = ((StartControllerImplementation) acceptorController)
                .getGamesNames();
        tcpip.send(names.size());
        names.forEach(name -> tcpip.send(name));
    }
}
