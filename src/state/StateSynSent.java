package state;

import Fsm.State;

public class StateSynSent extends State {

    private static String name = "SYN_SENT";

    public StateSynSent() {
        super(StateSynSent.name);
    }

    public String getName() {
        return StateSynSent.name;
    }

    public String toString() {
        return "State (" + StateSynSent.name + ")";
    }
}
