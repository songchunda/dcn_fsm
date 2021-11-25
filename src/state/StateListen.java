package state;

import Fsm.State;

public class StateListen extends State {

    private static String name = "LISTEN";

    public StateListen() {
        super(StateListen.name);
    }

    public String getName() {
        return StateListen.name;
    }

    public String toString() {
        return "State (" + StateListen.name + ")";
    }
}
