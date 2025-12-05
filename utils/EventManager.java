package utils;

import java.util.*;

public class EventManager {

    public interface EventListener {
        void onEvent(String event);
    }

    private List<EventListener> listeners = new ArrayList<>();

    public void addListener(EventListener l) {
        listeners.add(l);
    }

    public void trigger(String event) {
        for(EventListener l : listeners) {
            l.onEvent(event);
        }
    }
}
