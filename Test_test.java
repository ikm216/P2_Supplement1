import org.junit.*;

public class Test_test {
    @Test
    public void testInsertValueIntoNode(){
        Node node = new Node(1, 10);
        Assert.assertEquals(10, node.getNode());
    }
    @Test
    public void testInsertValueIntoLeft(){
        Node node = new Node(1, 10);
        node.insert(5);
        Assert.assertEquals(5, node.getLeft().getNode());
    }
    @Test
    public void testInsertValueIntoRight(){
        Node node = new Node(1, 10);
        node.insert(15);
        Assert.assertEquals(15, node.getRight().getNode());
    }
    @Test
    public void testDump(){
        Node node = new Node(1,10);
        node.insert(10);
        node.insert(20);

        String test_outcome = "Node ID: 1, Data: 10\n" + "\tNode ID: 2, Data: 10\n" + "\t\tNode ID: 3, Data: 20\n";

        Assert.assertEquals(test_outcome, node.dump());
    }
    }

