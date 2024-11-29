import org.junit.*;

public class Test_test {
    @Test
    public void testInsertValueIntoNode(){
        Node node = new Node(1, 10);
        Assert.assertEquals(10, node.getNode());
    }
}
