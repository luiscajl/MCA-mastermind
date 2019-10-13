package com.mca.mastermind.models.DAO;

import com.mca.mastermind.models.ProposedCombination;

class ProposedCombinationDAO extends CombinationDAO {

	ProposedCombinationDAO(ProposedCombination proposedCombination) {
		super(proposedCombination);
	}

	ProposedCombination getProposedCombination() {
		return (ProposedCombination) this.combination;
	}

}
