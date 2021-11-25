package event;

import Fsm.Event;

public class EventSynAck extends Event{

    private static String name = "SYNACK";

    public EventSynAck() {
        super(EventSynAck.name);
    }

}
