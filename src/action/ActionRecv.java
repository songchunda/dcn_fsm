package action;

import Fsm.Action;
import Fsm.Event;
import Fsm.FSM;
import main.MYFSM;

public class ActionRecv extends Action {

    public ActionRecv() {}

    @Override
    public void execute(FSM arg0, Event arg1) {
        System.out.println("Event "+ arg1.getName() +" received, current state is "+ arg0.currentState());
        MYFSM fsm = (MYFSM)arg0;
        fsm.rdata_incur();
        System.out.println("Data recieved: " + fsm.get_rdata_count());
    }

}