import data_structures.ArrayList;
import data_structures.LinkedList;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class LinkedListTests {
    private LinkedList<Integer> list = new LinkedList<>();
    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

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

    @Test
    public void AddShouldInsertElementAtIndex0() {
        list.add(0, 0);
        Integer lastExpected = 0;
        Assert.assertEquals(lastExpected, list.getLast());
    }


    @Test
    public void AddShouldThrownIndexOutOfBoundException() {
        exceptionRule.expect(IndexOutOfBoundsException.class);
        exceptionRule.expectMessage("Invalid index.");
        list.add(2, 0);
    }

    @Test
    public void GetShouldGiveElementAtGivenIndexZero() {
        list.add(0);
        Integer expected = 0;
        Assert.assertEquals(expected, list.get(0));
    }

    @Test
    public void GetShouldGiveElementAtGivenIndex() {
        list.add(0);
        list.add(2);
        list.add(4);
        Integer expected = 2;
        Assert.assertEquals(expected, list.get(1));
    }

    @Test
    public void GetShouldGiveElementAtGivenLastIndex() {
        list.add(0);
        list.add(2);
        list.add(4);
        Integer expected = 4;
        Assert.assertEquals(expected, list.get(2));
    }

    @Test
    public void GetShouldThrownIndexOutOfBoundException() {
        exceptionRule.expect(IndexOutOfBoundsException.class);
        exceptionRule.expectMessage("Invalid index.");
        list.get(0);
    }

    @Test
    public void ContainsShouldBeTrueIfElementIsInTheList() {
        list.add(0);
        list.add(2);
        list.add(4);
        Assert.assertTrue(list.contains(2));
    }

    @Test
    public void ContainsShouldBeFalseIfElementIsInTheList() {
        list.add(0);
        list.add(2);
        list.add(4);
        Assert.assertFalse(list.contains(3));
    }


    @Test
    public void RemoveShouldDeleteGivenElement() {
        list.add(0);
        list.add(2);
        list.add(4);
        list.remove(2);
        Assert.assertFalse(list.contains(2));
    }

    @Test
    public void RemoveShouldDeleteZeroPosElement() {
        list.add(0);
        list.add(2);
        list.add(4);
        list.remove(0);
        Assert.assertFalse(list.contains(0));
    }




}
