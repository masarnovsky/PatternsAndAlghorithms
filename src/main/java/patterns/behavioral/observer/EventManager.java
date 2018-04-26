package patterns.behavioral.observer;

import java.util.*;

public class EventManager {
    private Map<EventType, List<EventListener>> listeners = new HashMap<>();

    public EventManager(EventType... type) {
        Arrays.stream(type).forEach(t -> listeners.putIfAbsent(t, new ArrayList<>()));
    }

    public void subscribe(EventType type, EventListener listener) {
        listeners.get(type).add(listener);
    }

    public void unsubscribe(EventType type, EventListener listener) {
        listeners.getOrDefault(type, new ArrayList<>()).remove(listener);
    }

    public void notify(EventType type) {
        listeners.getOrDefault(type, new ArrayList<>()).stream().forEach(listener -> listener.update(type));
    }

}
