import org.junit.*;

public class Test_test {
    @Test
    public void testInsertValueIntoNode(){
        Node node = new Node(1, 10);
        Assert.assertEquals(10, node.getNode());

    @Test
    public void testInsertValueIntoLeft(){
        Node node = new Node(1, 10);
        node.insert(5);
        Assert.assertEquals(5, node.getLeft().getNode());
    }
    public void testInsertValueIntoRight(){
        Node node = new Node(1, 10);
        node.insert(15);
        Assert.assertEquals(15, node.getRight().getNode());
    }
    }
}
