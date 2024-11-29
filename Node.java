/**
 * A class representing a node in a binary tree.
 * Each node has a unique id, an integer value, and two child nodes (left and right).
 */

public class Node{
   private int nodeId, data;
   private Node left, right;

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




}