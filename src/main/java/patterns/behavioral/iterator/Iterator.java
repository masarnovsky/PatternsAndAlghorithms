package patterns.behavioral.iterator;

public interface Iterator<T> {
    void reset();

    void moveNext();

    boolean isDone();

    T current();
}
