package state;

import Fsm.State;

public class StateTimeWait extends State {

    private static String name = "TIME_WAIT";

    public StateTimeWait() {
        super(name);
    }

    public String getName() {
        return StateTimeWait.name;
    }

    public String toString() {
        return "State (" + StateTimeWait.name + ")";
    }
}
