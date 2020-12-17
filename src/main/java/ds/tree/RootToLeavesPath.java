package ds.tree;

import java.util.Stack;
/**
 * Given a binary tree, return all paths from the root to leaves.

For example, given the tree:

   1
  / \
 2   3
    / \
   4   5
Return [[1, 2], [1, 3, 4], [1, 3, 5]].
 */
public class RootToLeavesPath {

    static Stack<Integer> stack = new Stack<>();
    
    static void traverse(Node<Integer> node) {
        if(node == null) {
            return;
        }
        stack.push(node.data);
        traverse(node.left);
        traverse(node.right);
        
        if(node.left == null && node.right == null) {
            System.out.println(stack);
        }
        stack.pop();
    }
    
    public static void main(String[] args) {
        Node<Integer> node = new Node<>(1);
        node.left = new Node<>(2);
        node.right = new Node<>(3);
        node.right.left = new Node<>(4);
        node.right.right = new Node<>(5);
        
        traverse(node);
    }
}
