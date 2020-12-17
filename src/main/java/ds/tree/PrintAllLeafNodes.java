package ds.tree;

/**
Given a binary tree, print all leaf nodes.

output for below should be [2,-1,5]
<pre>
  10
 /  \
5    5
 \     \
   2    1
       / \
     -1   5
*/
public class PrintAllLeafNodes {

    static int noOfLeaveNodes = 0;
    static int nodesSum = 0;
    
    public static void main(String[] args) {

        System.out.println("PrintAllLeafNodes");

        Node<Integer> node = new Node<>(10);
        node.left = new Node<>(5);
        node.right = new Node<>(5);
        node.left.right = new Node<>(2);
        node.right.right = new Node<>(1);
        node.right.right.left = new Node<>(-1);
        node.right.right.right = new Node<>(5);

        traversePrint(node);
        System.out.println("noOfLeaveNodes: "+noOfLeaveNodes);
        System.out.println("nodesSum: "+nodesSum);
    }

    static void traversePrint(Node<Integer> node) {
        if (node == null) {
            return;
        }
        nodesSum += node.data;
        traversePrint(node.left);
        traversePrint(node.right);
        if (node.left == null && node.right == null) {
            System.out.println(node.data);
            noOfLeaveNodes++;
        }

    }

}

