package state;

import Fsm.State;

public class StateCloseWait extends State {

    private static String name = "CLOSE_WAIT";

    public StateCloseWait() {
        super(StateCloseWait.name);
    }

    public String getName() {
        return StateCloseWait.name;
    }

    public String toString() {
        return "State (" + StateCloseWait.name + ")";
    }
}
