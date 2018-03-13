package patterns.creational.singleton;

public class DemoMultiThread {
    public static void main(String[] args) {
        System.out.println("output must be the same!");
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());

        threadFoo.start();
        threadBar.start();
    }

    static class ThreadFoo implements Runnable {

        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("FOO");
            System.out.println(Singleton.value);
        }
    }

    static class ThreadBar implements Runnable {

        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("BAR");
            System.out.println(Singleton.value);
        }
    }
}
