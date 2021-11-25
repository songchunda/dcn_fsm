package event;

import Fsm.Event;

public class EventTimeout extends Event{

    private static String name = "TIMEOUT";

    public EventTimeout() {
        super(EventTimeout.name);
    }

}
