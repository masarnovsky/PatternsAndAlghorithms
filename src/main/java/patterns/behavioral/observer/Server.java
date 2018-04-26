package patterns.behavioral.observer;

public class Server {
    public EventManager manager;

    public Server() {
        this.manager = new EventManager(EventType.FATAL, EventType.UPDATE);
    }

    void sendUpdate() {
        manager.notify(EventType.UPDATE);
    }

    void criticalErrorInvoke() {
        manager.notify(EventType.FATAL);
    }
}
