package state;

import Fsm.State;

public class StateClosing extends State {

    private static String name = "CLOSING";

    public StateClosing() {
        super(StateClosing.name);
    }

    public String getName() {
        return StateClosing.name;
    }

    public String toString() {
        return "State (" + StateClosing.name + ")";
    }
}
