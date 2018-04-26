package patterns.behavioral.iterator;

public interface Container<T> {

    Iterator<T> createIterator();
}
