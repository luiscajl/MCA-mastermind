package com.mca.mastermind.views;

import com.mca.mastermind.controllers.Controller;
import com.mca.mastermind.controllers.ControllerVisitor;

public abstract class View implements ControllerVisitor {

    public void interact(Controller controller) {
        controller.accept(this);
    }
}