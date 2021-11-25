package event;

import Fsm.Event;

public class EventPassive extends Event{

    private static String name = "PASSIVE";

    public EventPassive() {
        super(EventPassive.name);
    }

}
