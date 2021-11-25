package event;

import Fsm.Event;

public class EventActive extends Event{

    private static String name = "ACTIVE";

    public EventActive() {
        super(EventActive.name);
    }

}
