package state;

import Fsm.State;

public class StateFinWait2 extends State {

    private static String name = "FIN_WAIT_2";

    public StateFinWait2() {
        super(StateFinWait2.name);
    }

    public String getName() {
        return StateFinWait2.name;
    }

    public String toString() {
        return "State (" + StateFinWait2.name + ")";
    }
}
