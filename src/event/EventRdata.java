package event;

import Fsm.Event;

public class EventRdata extends Event{

    private static String name = "RDATA";

    public EventRdata() {
        super(EventRdata.name);
    }

}
