package event;

import Fsm.Event;

public class EventFin extends Event{

    private static String name = "FIN";

    public EventFin() {
        super(EventFin.name);
    }

}
