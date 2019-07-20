import data_structures.ArrayList;
import data_structures.LinkedList;
import org.junit.Assert;
import org.junit.Test;


public class LinkedListTests {
    private LinkedList<Integer> list = new LinkedList<>();

    @Test
    public void ElementShouldBeInserted() {
        list.add(4);
        Assert.assertEquals(1, list.size());
    }

    @Test
    public void ElementShouldBeAddedInLastPosition() {
        list.add(2);
        Integer lastExpected = 2;
        Assert.assertEquals(lastExpected, list.getLast());
    }

    @Test
    public void SecondElementShouldBeAddedInLastPosition() {
        list.add(2);
        list.add(3);
        Integer lastExpected = 3;
        Assert.assertEquals(lastExpected, list.getLast());
    }

    @Test
    public void EmptyArrayLastPosShouldBeNull() {
        Assert.assertNull(list.getLast());
    }

    @Test
    public void ElementShouldBeAddedAtSpecificPosition() {
        list.add(0);
        list.add(1);
        list.add(2, 2);
        Integer lastExpected = 2;

        Assert.assertEquals(lastExpected, list.getLast());

    }


}
