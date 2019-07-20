package data_structures;

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
            throw new IndexOutOfBoundsException("Invalid index");
        }
        int count = 0;
        Node<T> temp = head;
        while (count != index) {
            temp = temp.next;
            ++count;
        }
        Node<T> next_temp = temp.next;
        temp.next = next_temp;


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

}
