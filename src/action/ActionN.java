package action;

import Fsm.Action;
import Fsm.Event;
import Fsm.FSM;

public class ActionN extends Action {

    public ActionN() {
    }

    @Override
    public void execute(FSM arg0, Event arg1) {
        if ((arg1.getName()).equals("RDATA")){
            System.out.println("DATA recieved "+ arg1.getValue()+", current State is "+ arg0.currentState());
        }
        else if ((arg1.getName()).equals("SDATA")){
            System.out.println("DATA sent "+ arg1.getValue()+", current State is "+ arg0.currentState());
        }
    }
}