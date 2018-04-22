package patterns.behavioral.cor;

public class Demo {

    private static Server server;

    private static void init() {
        server = new Server();
        server.register(new User("user", "user", User.Role.USER));
        server.register(new User("admin", "admin", User.Role.ADMIN));

        Approver approver = new ThrottlingApprover(3);
        approver.linkWith(new UserExistsApprover()).linkWith(new RoleCheckApprover());

        server.setApprover(approver);
    }

    public static void main(String[] args) {
        init();

        new Thread(() -> {
            User user = new User("user", null, User.Role.USER);
            server.logIn(user);
        }).start();

        new Thread(() -> {
            User admin = new User("admin", "admin", User.Role.ADMIN);
            server.logIn(admin);
        }).start();

        new Thread(() -> {
            User badUser = new User(null, null, User.Role.ANON);
            server.logIn(badUser);
            server.logIn(badUser);
            server.logIn(badUser);
        }).start();
    }
}
