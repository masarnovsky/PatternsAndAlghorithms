package patterns.behavioral.cor;

public abstract class Approver {
    private Approver next;

    public Approver linkWith(Approver next) {
        this.next = next;
        return next;
    }

    public abstract boolean check(User user);

    protected boolean checkNext(User user) {
        if (next == null) {
            return true;
        }
        return next.check(user);
    }
}
