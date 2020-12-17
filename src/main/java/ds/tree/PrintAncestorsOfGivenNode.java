package ds.tree;

/**
Given a binary tree, Print ancestors of a node in Binary tree.

for input node -1 the output for below should be [1,5,10]
<pre>
  10
 /  \
5    5
 \     \
   2    1
       / \
     -1   5
*/
public class PrintAncestorsOfGivenNode {
  
    
  
    public static void main(String [] args){
    
      System.out.println("test");
      
      Node<Integer> node = new Node<>(10);
      node.left = new Node<>(5);
      node.right = new Node<>(5);
      node.left.right = new Node<>(2);
      node.right.right = new Node<>(1);
      node.right.right.left = new Node<>(-1);
      node.right.right.right = new Node<>(5);
      
      traversePrint(node, node.right.right.left);
      
      
    }
  
    static boolean traversePrint(Node<Integer> node, Node<Integer> targetNode){
      if(node == null){
        return false;
      }
      if(node == targetNode) {
        return true;
      }
      if(traversePrint(node.left, targetNode) || traversePrint(node.right, targetNode)) {
        System.out.println(node.data);
        return true;
      }
      return false;
    }
        
}