package data_structures;

public class Heap {

    private Integer[] array;
    private Integer capacity;
    private Integer count;

    public Heap(int capacity) {
        array = new Integer[capacity];
        this.capacity = capacity;
        this.count = 0;
    }

    public int size() {
        return count;
    }


    private Integer leftChildren(int index) {
        return index * 2 + 1;
    }

    private Integer rightChildren(int index) {
        return index * 2 + 2;
    }

    private Integer parent(int index) {
        return (index - 1) / 2;
    }


    public Integer getMin() {
        return array[0];
    }

    public void insert(Integer element) {
        if (count + 1 >= capacity) {
            throw new IllegalStateException();
        }
        array[count] = element;
        count++;
        int posInsertedElement = count - 1;
        bubbleUp(posInsertedElement);

    }


    public Integer ExtractMin() {
        if (size() == 1) {
            --count;
            return array[0];
        }

        Integer element = array[0];
        array[0] = array[count - 1];
        --count;
        bubbleDown(0);
        return element;
    }

    private void bubbleDown(int index) {
        int left = leftChildren(index);
        int right = rightChildren(index);
        int smallest = index;
        if (left < count && array[left] < array[smallest]) {
            smallest = left;
        }

        if (right < count && array[right] < array[smallest]) {
            smallest = right;
        }
        if (smallest != index) {
            swap(index, smallest);
            bubbleDown(smallest);
        }
    }

    private void bubbleUp(int posInsertedElement) {
        while (posInsertedElement > 0 && array[parent(posInsertedElement)] > array[posInsertedElement]) {
            swap(parent(posInsertedElement), posInsertedElement);
            posInsertedElement = parent(posInsertedElement);
        }
    }

    private void swap(int index, int smallest) {
        int temp = array[smallest];
        array[smallest] = array[index];
        array[index] = temp;
    }

}
