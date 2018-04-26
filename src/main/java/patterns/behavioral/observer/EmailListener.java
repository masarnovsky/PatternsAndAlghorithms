package patterns.behavioral.observer;

public class EmailListener implements EventListener {
    private String email;

    public EmailListener(String email) {
        this.email = email;
    }

    @Override
    public void update(EventType event) {
        System.out.println("Send to email: " + email + " than some event occurent: " + event);
    }
}
