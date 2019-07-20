import data_structures.ArrayList;
import org.junit.Assert;
import org.junit.Test;

public class ArrayListTests {

    private ArrayList array = new ArrayList();

    @Test
    public void elementShouldBeAdded() {
        array.add(0);
        Assert.assertEquals(1, array.size());
    }

    @Test
    public void groupOfElementsSHouldBeAdded() {
        for (int i = 0; i < 100; i++) {
            array.add(i);
        }
        Assert.assertEquals(100, array.size());
    }

    @Test
    public void ElementShouldHaveValue() {
        array.add(2);
        Assert.assertEquals(2, array.get(0));
    }

    @Test
    public void ELementShouldHaveNullValue() {
        array.add(null);

        Assert.assertNull(array.get(0));
    }

    @Test
    public void elementShouldBeRemoved() {
        array.add(2);
        array.remove(0);
        Assert.assertEquals(0, array.size());
    }

    @Test
    public void arrayShouldBeEmpty() {

        Assert.assertTrue(array.isEmpty());
    }

    @Test
    public void arrayShouldNotBeEmpty() {
        array.add(2);
        Assert.assertFalse(array.isEmpty());
    }

}