package com.mca.mastermind;

import java.io.IOException;
import com.mca.mastermind.controllers.Logic;
import com.mca.mastermind.controllers.implementation.LogicImplementation;
import com.mca.mastermind.models.DAO.SessionImplementationDAO;

public class MastermindStandalone extends Mastermind {

    @Override
    protected Logic createLogic() {
        return new LogicImplementation(new SessionImplementationDAO());
    }

    public static void main(String[] args) throws IOException {
        new MastermindStandalone().play();
    }
}
