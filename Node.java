/**
 * A class representing a node in a binary tree.
 * Each node has a unique id, an integer value, and two child nodes (left and right).
 */

public class Node{
   private int nodeId, data;
   private Node left, right;
   private static int id_count = 1;

   /**
     * Constructs a new Node with the given ID and data.
     *
     * @param nodeId The unique id for the node.
     * @param data   The integer stored in the node.
     */

   public Node(int nodeId, int data){
    this.nodeId = nodeId;
    this.data = data;
   }
   /**
     * Gets the data stored in the node.
     *
     * @return The integer data of the node.
     */
   public int getNode(){
    return data;
   }

   /**
 * Retrieves the left child of the current node.
 *
 * @return The left child node, or null if no left child exists.
 */
   public Node getLeft(){
    return left;
   }

   /**
 * Retrieves the right child of the current node.
 *
 * @return The right child node, or null if no right child exists.
 */
   public Node getRight(){
    return right;
   }

   /**
 * Inserts a value into the tree doing the following:
 * - If the value is less than the current node's data, it is inserted into the left subtree.
 * - If the value is greater than or equal to the current node's data, it is inserted into the right subtree.
 *
 * @param val The value to be inserted into the tree.
 */
   public void insert(int val){
    if (val < this.data){
        if (this.left == null){
            this.left = new Node(++id_count, val);
        }
        else{
            this.left.insert(val);
        }
    }
    else{
        if (this.right == null){
            this.right = new Node(++id_count, val);
        }
        else{
            this.right.insert(val);
        }
    }
   }

   /**
 * Dumps the structure of the binary tree into a formatted string representation.
 * The structure includes each node's ID, data, and its level in the tree.
 * Each level is indented with tabs for better visualization of the tree hierarchy.
 *
 * @return A string representation of the binary tree.
 */
   public String dump(){
    StringBuilder string = new StringBuilder();
    dump(this, string, 0);
    return string.toString();
   }

   /**
 * A helper method for recursively dumping the structure of the tree.
 * This method traverses the tree in a pre-order manner and appends node details
 * to the provided StringBuilder.
 *
 * @param node   The current node being processed.
 * @param string The StringBuilder object used to accumulate the tree structure.
 * @param level  The current depth of the node in the tree, used for indentation.
 */
   private void dump(Node node, StringBuilder string, int level){
    if (node != null){
        string.append("\t".repeat(level))
        .append("Node id: ").append(node.nodeId)
        .append(", Data: ").append(node.data).append("\n");
        dump(node.left, string, level + 1);
        dump(node.right, string, level + 1);
    }
   }

}