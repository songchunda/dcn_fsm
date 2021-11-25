package state;

import Fsm.State;

public class StateSynRcvd extends State {

    private static String name = "SYN_RCVD";

    public StateSynRcvd() {
        super(StateSynRcvd.name);
    }

    public String getName() {
        return StateSynRcvd.name;
    }

    public String toString() {
        return "State (" + StateSynRcvd.name + ")";
    }
}
