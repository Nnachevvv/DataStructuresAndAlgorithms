package data_structures;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Queue<T> {

    private java.util.LinkedList<T> list;

    public Queue() {
        list = new LinkedList<>();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list.getFirst();
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list.removeFirst();
    }

    public void enqueue(T element) {
        list.add(element);
    }
}
