package com.mca.mastermind.controllers;

public interface ControllerVisitor {

    void visit(StartController startController);

    void visit(ResumeController resumeController);

    void visit(ProposeCombinationController proposeCombinationController);
}
