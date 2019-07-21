package data_structures;

import java.util.List;

class Node<T> {
    public Node<T> next;
    public T value;

    public Node(T value) {
        this.value = value;
        this.next = null;
    }
}

public class LinkedList<T> {
    private Node<T> head;
    private int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void add(T value) {
        ++size;
        if (head == null) {
            head = new Node<T>(value);
            return;
        }

        Node<T> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node<T>(value);

    }

    public void add(int index, T value) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index.");
        }

        ++size;
        if (index == 0) {
            head = new Node<>(value);
            return;
        }

        int count = 0;
        Node<T> temp = head;
        while (count + 1 != index) {
            temp = temp.next;
            ++count;
        }

        Node<T> next_temp = new Node<>(value);
        next_temp.next = temp.next;
        temp.next = next_temp;


    }

    public void remove(T element) {
        Node<T> temp = head;
        if (temp.value == element) {
            head = temp.next;
            return;
        }
        while (temp.next != null) {
            if (temp.next.value == element) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }


    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index.");
        }
        Node<T> temp = head;
        int count = 0;
        while (count != index) {
            ++count;
            temp = temp.next;
        }
        return temp.value;

    }
    public T getLast() {
        if (size == 0) {
            return null;
        }
        Node<T> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp.value;
    }

    public int size() {
        return size;
    }


    public void clear() {
        this.head = null;
        this.size = 0;
    }

    public boolean contains(T element) {
        Node temp = head;
        while (temp != null) {
            if (temp.value == element) {
                return true;
            }
            temp = temp.next;
        }

        return false;
    }

    public boolean equals(List<T> list) {
        if (size != list.size()) {
            return false;
        }

        Node<T> temp = head;
        int index = 0;
        while (head != null) {
            if (head.value != list.get(index)) {
                return false;
            }
            head = head.next;
            index++;
        }
        return true;
    }



}
