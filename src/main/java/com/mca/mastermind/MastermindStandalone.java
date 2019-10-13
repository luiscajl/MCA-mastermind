package com.mca.mastermind;

import com.mca.mastermind.controllers.Logic;
import com.mca.mastermind.controllers.implementation.LogicImplementation;

public class MastermindStandalone extends Mastermind{

	@Override
	protected Logic createLogic() {
		return new LogicImplementation();
	}
	
	public static void main(String[] args) {
		new MastermindStandalone().play();
	}

}
