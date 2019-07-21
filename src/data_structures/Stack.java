package data_structures;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class Stack<T> {
    private LinkedList<T> list;

    public Stack() {
        list = new LinkedList<>();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.getLast();
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.removeLast();
    }

    public void push(T element) {
        list.add(element);
    }


}
