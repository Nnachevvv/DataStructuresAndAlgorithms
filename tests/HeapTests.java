import data_structures.Heap;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class HeapTests {
    private Heap heap = new Heap(40);
  
    @Test
    public void MinShouldReturnMinimum() {
        heap.insert(2);
        heap.insert(4);
        heap.insert(0);
        Integer min = 0;
        Assert.assertEquals(min, heap.getMin());
    }

    @Test
    public void ExtractMinShouldRemoveMinimum() {
        heap.insert(2);
        heap.insert(4);
        heap.insert(0);
        heap.insert(-1);
        heap.insert(-2);
        heap.insert(-5);
        Integer min = -2;
        heap.ExtractMin();
        Assert.assertEquals(min, heap.getMin());
    }


    @Test
    public void ExtractMinShouldReturnMinimum() {
        heap.insert(2);
        heap.insert(4);
        heap.insert(0);


        Integer min = 0;
        Assert.assertEquals(min, heap.ExtractMin());
    }


}
