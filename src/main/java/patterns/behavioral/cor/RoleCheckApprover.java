package patterns.behavioral.cor;

public class RoleCheckApprover extends Approver {

    @Override
    public boolean check(User user) {
        if (user.getRole().equals(User.Role.ADMIN)) {
            System.out.println("hi, admin!");
            return true;
        }

        System.out.println("hi, user!");
        return checkNext(user);
    }
}
