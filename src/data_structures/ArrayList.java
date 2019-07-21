package data_structures;

import java.lang.reflect.Array;
/*
TODO
MAYBE GENERIC SPECIALIZIATION?

 */


public class ArrayList {

    private int count;
    private int capacity;
    private Object[] elements;

    public ArrayList() {
        this.capacity = 2;
        this.count = 0;
        this.elements = new Object[capacity];
    }


    public void add(Object element) {
        if (count + 1 == capacity) {
            ensureCapacity(capacity * 2);
        }
        elements[count] = element;
        count += 1;
    }

    public void add(int index, Object element) {
        if (count + 1 == capacity) {
            ensureCapacity(capacity * 2);
        }
        for (int i = count; i >= index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
        count += 1;


    }

    public Object remove(int index) {
        if (index > count || index < 0) {
            throw new IndexOutOfBoundsException("Invalid Index");
        }

        Object removedElement = elements[index];
        elements[index] = elements[count - 1];
        --count;

        return removedElement;
    }


    public Object get(int index) {
        if (index > count || index < 0) {
            throw new IndexOutOfBoundsException("Invalid Index");
        }
        return elements[index];
    }


    public Object set(int index, Object element) {
        if (index > count || index < 0) {
            throw new IndexOutOfBoundsException("Invalid Index");
        }
        Object tempElement = elements[index];
        this.elements[index] = element;
        return tempElement;

    }

    public void clear() {
        elements = new Object[capacity];
        count = 0;
        capacity = 2;
    }


    public void ensureCapacity(int minCapacity) {
        Object[] temp = new Object[minCapacity];
        System.arraycopy(elements, 0, temp, 0, elements.length);
        this.elements = temp;
        this.capacity = minCapacity;
    }

    public boolean contains(Object element) {
        for (int i = 0; i < count; i++) {
            if (element.equals(elements[i])) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(Object element) {
        for (int i = 0; i < count; i++) {
            if (elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(Object element) {
        for (int i = count - 1; i >= 0; i--) {
            if (elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public Object[] toArray() {
        return elements;
    }

    public void trimToSize() {
        this.capacity = count;
    }


    public boolean isEmpty() {
        return count == 0;
    }


    public int size() {
        return this.count;
    }


}



