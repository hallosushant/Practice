package ds.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
Given a binary tree, find a minimum path sum from root to a leaf.

For example, the minimum path in this tree is [10, 5, 1, -1], which has sum 15.
<pre>
  10
 /  \
5    5
 \     \
   2    1
       /
     -1
*/
public class MinPathSum {
    static Stack<Integer> stack = new Stack<>();
    static List<Integer> sums = new ArrayList<>();
    static int pathSum = 0;
    public static void main(String[] args) {
        System.out.println("MinPathSum");
        Node<Integer> node = new Node<>(10);
        node.left = new Node<>(5);
        node.left.right=new Node<>(2);
        node.right = new Node<>(5);
        node.right.right = new Node<>(1);
        node.right.right.left = new Node<>(-1);
        
        traverse(node);
        System.out.println(sums);
        
        System.out.println(Collections.min(sums));
    }
    
    static void traverse(Node<Integer> node) {
        if(node == null) {
            return;
        }
        stack.push(node.data);
        pathSum += node.data;
        traverse(node.left);
        traverse(node.right);
        if(node.left == null && node.right == null) {
            System.out.println(stack);
            sums.add(pathSum);
        }
        pathSum -= node.data;
        stack.pop();
    }
        
}
