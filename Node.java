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

   public Node getLeft(){
    return left;
   }

   public Node getRight(){
    return right;
   }

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


}