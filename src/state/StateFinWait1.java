package state;

import Fsm.State;

public class StateFinWait1 extends State {

    private static String name = "FIN_WAIT_1";

    public StateFinWait1() {
        super(StateFinWait1.name);
    }

    public String getName() {
        return StateFinWait1.name;
    }

    public String toString() {
        return "State (" + StateFinWait1.name + ")";
    }
}
