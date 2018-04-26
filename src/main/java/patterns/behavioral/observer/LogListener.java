package patterns.behavioral.observer;

public class LogListener implements EventListener {
    private String log;

    public LogListener(String log) {
        this.log = log;
    }

    @Override
    public void update(EventType event) {
        System.out.println("save to log " + log + "that some event(only errors!) occurent:  " + event);
    }
}
