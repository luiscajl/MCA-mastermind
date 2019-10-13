package com.mca.mastermind.controllers;

import java.io.IOException;

public interface ControllersVisitor {

    void visit(StartController startController) throws IOException;

    void visit(PlayController playController) throws IOException;

    void visit(SaveController saveController) throws IOException;

    void visit(ResumeController resumeController);
}
