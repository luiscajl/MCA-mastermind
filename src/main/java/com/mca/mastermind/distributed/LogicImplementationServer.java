package com.mca.mastermind.distributed;

import com.mca.mastermind.controllers.implementation.LogicImplementation;
import com.mca.mastermind.distributed.dispatchers.AttemptsDispatcher;
import com.mca.mastermind.distributed.dispatchers.BlacksDispatcher;
import com.mca.mastermind.distributed.dispatchers.ColorsDispatcher;
import com.mca.mastermind.distributed.dispatchers.DispatcherPrototype;
import com.mca.mastermind.distributed.dispatchers.ExistsDispatcher;
import com.mca.mastermind.distributed.dispatchers.FrameType;
import com.mca.mastermind.distributed.dispatchers.GetTitleDispatcher;
import com.mca.mastermind.distributed.dispatchers.HasNameDispatcher;
import com.mca.mastermind.distributed.dispatchers.LooserDispatcher;
import com.mca.mastermind.distributed.dispatchers.NextDispatcher;
import com.mca.mastermind.distributed.dispatchers.ProposeCombinationDispatcher;
import com.mca.mastermind.distributed.dispatchers.RedoDispatcher;
import com.mca.mastermind.distributed.dispatchers.RedoableDispatcher;
import com.mca.mastermind.distributed.dispatchers.ResumeDispatcher;
import com.mca.mastermind.distributed.dispatchers.SaveDispatcher;
import com.mca.mastermind.distributed.dispatchers.SaveNamedDispatcher;
import com.mca.mastermind.distributed.dispatchers.SetTitleDispatcher;
import com.mca.mastermind.distributed.dispatchers.StartDispatcher;
import com.mca.mastermind.distributed.dispatchers.StartNameDispatcher;
import com.mca.mastermind.distributed.dispatchers.StateDispatcher;
import com.mca.mastermind.distributed.dispatchers.TitlesDispatcher;
import com.mca.mastermind.distributed.dispatchers.UndoDispatcher;
import com.mca.mastermind.distributed.dispatchers.UndoableDispatcher;
import com.mca.mastermind.distributed.dispatchers.WhitesDispatcher;
import com.mca.mastermind.distributed.dispatchers.WidthDispatcher;
import com.mca.mastermind.distributed.dispatchers.WinnerDispatcher;
import com.mca.mastermind.models.DAO.SessionImplementationDAO;

public class LogicImplementationServer extends LogicImplementation {

	public LogicImplementationServer(SessionImplementationDAO sessionImplementationDAO) {
		super(sessionImplementationDAO);
	}

	public void createDispatchers(DispatcherPrototype dispatcherPrototype) {
		dispatcherPrototype.add(FrameType.START, new StartDispatcher(this.startControllerImplementation));
		dispatcherPrototype.add(FrameType.START_NAME, new StartNameDispatcher(this.startControllerImplementation));
		dispatcherPrototype.add(FrameType.TITLES, new TitlesDispatcher(this.startControllerImplementation));
		dispatcherPrototype.add(FrameType.STATE, new StateDispatcher(this.playControllerImplementation));
		dispatcherPrototype.add(FrameType.UNDO, new UndoDispatcher(this.playControllerImplementation));
		dispatcherPrototype.add(FrameType.REDO, new RedoDispatcher(this.playControllerImplementation));
		dispatcherPrototype.add(FrameType.UNDOABLE, new UndoableDispatcher(this.playControllerImplementation));
		dispatcherPrototype.add(FrameType.REDOABLE, new RedoableDispatcher(this.playControllerImplementation));
		dispatcherPrototype.add(FrameType.WINNER, new WinnerDispatcher(this.playControllerImplementation));
		dispatcherPrototype.add(FrameType.LOOSER, new LooserDispatcher(this.playControllerImplementation));
		dispatcherPrototype.add(FrameType.ATTEMPTS, new AttemptsDispatcher(this.playControllerImplementation));
		dispatcherPrototype.add(FrameType.COLORS, new ColorsDispatcher(this.playControllerImplementation));
		dispatcherPrototype.add(FrameType.PROPOSECOMBINATION,
				new ProposeCombinationDispatcher(this.playControllerImplementation));
		dispatcherPrototype.add(FrameType.WIDTH, new WidthDispatcher(this.playControllerImplementation));
		dispatcherPrototype.add(FrameType.NEXT, new NextDispatcher(this.playControllerImplementation));
		dispatcherPrototype.add(FrameType.BLACKS, new BlacksDispatcher(this.playControllerImplementation));
		dispatcherPrototype.add(FrameType.WHITES, new WhitesDispatcher(this.playControllerImplementation));
		dispatcherPrototype.add(FrameType.SAVE, new SaveDispatcher(this.saveControllerImplementation));
		dispatcherPrototype.add(FrameType.SAVE_NAMED, new SaveNamedDispatcher(this.saveControllerImplementation));
		dispatcherPrototype.add(FrameType.HAS_NAME, new HasNameDispatcher(this.saveControllerImplementation));
		dispatcherPrototype.add(FrameType.EXISTS, new ExistsDispatcher(this.saveControllerImplementation));
		dispatcherPrototype.add(FrameType.GET_TITLE, new GetTitleDispatcher(this.saveControllerImplementation));
		dispatcherPrototype.add(FrameType.SET_TITLE, new SetTitleDispatcher(this.saveControllerImplementation));
		dispatcherPrototype.add(FrameType.NEW_GAME, new ResumeDispatcher(this.resumeControllerImplementation));
	}

}
