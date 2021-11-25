package state;

import Fsm.State;

public class StateEstablished extends State {

    private static String name = "ESTABLISHED";

    public StateEstablished() {
        super(StateEstablished.name);
    }

    public String getName() {
        return StateEstablished.name;
    }

    public String toString() {
        return "State (" + StateEstablished.name + ")";
    }
}
