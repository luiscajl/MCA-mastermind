package com.mca.mastermind.views;

import com.mca.mastermind.controllers.Controller;
import com.mca.mastermind.controllers.ControllersVisitor;

public abstract class View implements ControllersVisitor {

    public void interact(Controller controller) {
        controller.accept(this);
    }
}
