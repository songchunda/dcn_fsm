package action;

import Fsm.Action;
import Fsm.Event;
import Fsm.FSM;

public class ActionFin extends Action {

    public ActionFin() {}

    @Override
    public void execute(FSM arg0, Event arg1) {
        System.out.println("Fin");
        System.out.println("Event "+ arg1.getName() +" received, current State is "+ arg0.currentState());
    }
}