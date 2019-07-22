import data_structures.BinaryTree;
import org.junit.Assert;
import org.junit.Test;

public class BinaryTreeTests {
    BinaryTree tree = new BinaryTree();

    @Test
    public void InsertShouldAddElement() {
        tree.insert(3);
        Assert.assertEquals(3, tree.maxElement());
    }
}
