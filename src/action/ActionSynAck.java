package action;

import Fsm.Action;
import Fsm.Event;
import Fsm.FSM;

public class ActionSynAck extends Action {

    public ActionSynAck() {
    }

    @Override
    public void execute(FSM arg0, Event arg1) {
        System.out.println("Event "+ arg1.getName() + " received, current state is " + arg0.currentState());
    }
}
