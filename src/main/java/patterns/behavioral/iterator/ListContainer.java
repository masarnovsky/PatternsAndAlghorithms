package patterns.behavioral.iterator;

import java.util.Arrays;

public class ListContainer implements Container<Integer> {

    private Integer[] list;

    public ListContainer(Integer... list) {
        this.list = Arrays.copyOf(list, list.length);
    }

    @Override
    public Iterator<Integer> createIterator() {
        return new ForwardIterator(list);
    }

    public Iterator<Integer> createBackwardIterator() {
        return new BackwardIterator(list);
    }

    private class ForwardIterator implements Iterator<Integer> { // default iterator
        private Integer[] source;
        private int position;

        public ForwardIterator(Integer[] list) {
            source = Arrays.copyOf(list, list.length);
            position = 0;
        }

        @Override
        public void reset() {
            position = 0;
        }

        @Override
        public void moveNext() {
            position++;
        }

        @Override
        public boolean isDone() {
            return position > source.length - 1;
        }

        @Override
        public Integer current() {
            return source[position];
        }
    }

    private class BackwardIterator implements Iterator<Integer> {
        private Integer[] source;
        private int position;

        public BackwardIterator(Integer[] list) {
            source = Arrays.copyOf(list, list.length);
            position = list.length - 1;
        }

        @Override
        public void reset() {
            position = list.length - 1;
        }

        @Override
        public void moveNext() {
            position--;
        }

        @Override
        public boolean isDone() {
            return position < 0;
        }

        @Override
        public Integer current() {
            return source[position];
        }
    }
}
