package patterns.behavioral.iterator;

public class Demo {
    public static void main(String[] args) {
        ListContainer container = new ListContainer(3, 4, 5, 6, 7, 8, 9);

        System.out.println("standart iterator:");
        Iterator<Integer> iterator = container.createIterator();
        while (!iterator.isDone()) {
            System.out.println(iterator.current());
            iterator.moveNext();
        }

        System.out.println("backward iterator:");
        Iterator<Integer> backwardIterator = container.createBackwardIterator();
        while (!backwardIterator.isDone()) {
            System.out.println(backwardIterator.current());
            backwardIterator.moveNext();
        }
    }
}
