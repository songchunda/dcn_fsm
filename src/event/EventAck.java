package event;

import Fsm.Event;

public class EventAck extends Event{

    private static String name = "ACK";

    public EventAck() {
        super(EventAck.name);
    }

}
