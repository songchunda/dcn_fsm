package action;

import Fsm.Action;
import Fsm.Event;
import Fsm.FSM;
import main.MYFSM;

public class ActionClose extends Action {

    public ActionClose() {}

    @Override
    public void execute(FSM arg0, Event arg1) {
        System.out.println("Event "+ arg1.getName() +" received, current state is "+ arg0.currentState());
        MYFSM fsm = (MYFSM)arg0;
        System.out.println("\nreset data count\n");
        fsm.reset_data_count();
    }

}