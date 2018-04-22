package patterns.behavioral.cor;

public class UserExistsApprover extends Approver {

    @Override
    public boolean check(User user) {
        if (!Server.hasUser(user)) {
            System.out.println("there is no user with that username!");
            return false;
        }
        return checkNext(user);
    }
}
