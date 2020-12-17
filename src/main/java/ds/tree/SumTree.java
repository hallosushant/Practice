package ds.tree;

/**
 * 
 * Write a function that returns true if the given Binary Tree is SumTree else false. 
 * A SumTree is a Binary Tree where the value of a node is equal to the sum of the nodes present in its left subtree and right subtree. 
 * An empty tree is SumTree and sum of an empty tree can be considered as 0. 
 * A leaf node is also considered as SumTree.
<pre>
Following is an example of SumTree. 

          26
        /   \
      10     3
    /    \     \
  4      6      3


 *
 */
public class SumTree {
    
    Node<Integer> node;

    /* Utility function to check if the given node is leaf or not */
    boolean isLeaf(Node<Integer> node) {
        return node != null && node.left == null && node.right == null;
    }

    /*
     * returns 1 if SumTree property holds for the given tree
     */
    int isSumTree(Node<Integer> node) {
        int ls; // for sum of nodes in left subtree
        int rs; // for sum of nodes in right subtree

        /*
         * If node is NULL or it's a leaf node then return true
         */
        if (node == null || isLeaf(node))
            return 1;

        if (isSumTree(node.left) != 0 && isSumTree(node.right) != 0) {
            // Get the sum of nodes in left subtree
            if (node.left == null)
                ls = 0;
            else if (isLeaf(node.left))
                ls = node.left.data;
            else
                ls = 2 * (node.left.data);

            // Get the sum of nodes in right subtree
            if (node.right == null)
                rs = 0;
            else if (isLeaf(node.right))
                rs = node.right.data;
            else
                rs = 2 * (node.right.data);

            /*
             * If root's data is equal to sum of nodes in left and right subtrees then return 1 else return 0
             */
            if ((node.data == rs + ls))
                return 1;
            else
                return 0;
        }

        return 0;
    }

    /* Driver program to test above functions */
    public static void main(String args[]) {
        SumTree tree = new SumTree();
        tree.node = new Node<>(26);
        tree.node.left = new Node<>(10);
        tree.node.right = new Node<>(3);
        tree.node.left.left = new Node<>(4);
        tree.node.left.right = new Node<>(6);
        tree.node.right.right = new Node<>(3);

        if (tree.isSumTree(tree.node) != 0)
            System.out.println("The given tree is a sum tree");
        else
            System.out.println("The given tree is not a sum tree");
    }
}

