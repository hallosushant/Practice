package ds.tree;
/**
This problem was asked by Google.

Invert a binary tree.

For example, given the following tree:
<pre>
    a
   / \
  b   c
 / \  /
d   e f
should become:

  a
 / \
 c  b
 \  / \
  f e  d
 */
public class InvertBinaryTree {
    public static void main(String[] args) {
        Node<Character> node = new Node<>('a');
        node.left = new Node<>('b');
        node.right = new Node<>('c');
        node.left.left = new Node<>('d');
        node.left.right = new Node<>('e');
        node.right.left = new Node<>('f');
        new BinaryTreePrinter<Character>(node).print(System.out);
        
        Node<Character> node1 = invert(node);
        
        new BinaryTreePrinter<Character>(node1).print(System.out);

    }

    private static Node<Character> invert(Node<Character> node) {
        if (node == null) {
            return null;
        }
        Node<Character> temp = node.left;
        node.left = node.right;
        node.right = temp;

        invert(node.left);
        invert(node.right);
        return node;
    }

}
