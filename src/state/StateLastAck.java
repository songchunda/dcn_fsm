package state;

import Fsm.State;

public class StateLastAck extends State {

    private static String name = "LAST_ACK";

    public StateLastAck() {
        super(StateLastAck.name);
    }

    public String getName() {
        return StateLastAck.name;
    }

    public String toString() {
        return "State (" + StateLastAck.name + ")";
    }
}
