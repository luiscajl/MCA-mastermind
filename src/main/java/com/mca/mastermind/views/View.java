package com.mca.mastermind.views;

import com.mca.mastermind.controllers.Controller;
import com.mca.mastermind.controllers.ControllerVisitor;

public interface View extends ControllerVisitor {

    void interact(Controller controller);
}