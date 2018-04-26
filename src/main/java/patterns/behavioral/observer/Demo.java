package patterns.behavioral.observer;

public class Demo {
    public static void main(String[] args) {
        Server server = new Server();
        EmailListener admin = new EmailListener("admin@gmail.com");

        server.manager.subscribe(EventType.UPDATE, new EmailListener("exmpl@gmail.com"));
        server.manager.subscribe(EventType.UPDATE, admin);
        server.manager.subscribe(EventType.FATAL, new LogListener("fatal_errors.txt"));

        server.sendUpdate();
        System.out.println();
        server.criticalErrorInvoke();

        System.out.println();
        server.manager.unsubscribe(EventType.UPDATE, admin);

        server.sendUpdate();
    }
}
