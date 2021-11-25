package state;

import Fsm.State;

public class StateClosed extends State {

    private static String name = "CLOSED";

    public StateClosed() {
        super(StateClosed.name);
    }

    public String getName() {
        return StateClosed.name;
    }

    public String toString() {
        return "State (" + StateClosed.name + ")";
    }
}
