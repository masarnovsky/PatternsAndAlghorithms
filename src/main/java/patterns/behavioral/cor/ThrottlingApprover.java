package patterns.behavioral.cor;

public class ThrottlingApprover extends Approver {
    private int requestPerMinute;
    private int request;
    private long currentTime;

    public ThrottlingApprover(int requestPerMinute) {
        this.requestPerMinute = requestPerMinute;
        this.currentTime = System.currentTimeMillis();
    }

    @Override
    public boolean check(User user) {
        if (System.currentTimeMillis() > currentTime + 60_000) {
            request = 0;
            currentTime = System.currentTimeMillis();
        }
        request++;

        if (request > requestPerMinute) {
            System.out.println("request limit exceeded, close current thread");
            Thread.currentThread().stop();
        }

        return checkNext(user);
    }
}
