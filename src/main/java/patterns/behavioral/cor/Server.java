package patterns.behavioral.cor;

import java.util.HashMap;
import java.util.Map;

public class Server {
    private static Map<String, User> users = new HashMap<>();
    private Approver approver;

    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    public boolean logIn(User user) {

        if (approver.check(user)) {
            System.out.println("authorization have been successful");
            return true;
        }
        return false;
    }

    public void register(User user) {
        users.put(user.getUsername(), user);
    }

    public static boolean hasUser(User user) {
        return users.containsKey(user.getUsername());
    }
}
