package ds.tree;

public class BinaryTreeHeight {

    // Recursive function to calculate height of given binary tree
    public static int height(Node<Integer> node) {
        // Base case: empty tree has height 0
        if (node == null) {
            System.out.println("0");
            return 0;
        }
        System.out.println(node.data);
        // recur for left and right subtree and consider maximum depth
        int height = 1 + Math.max(height(node.left), height(node.right));
        System.out.println("height=" + height);
        return height;
    }

    public static void main(String[] args) {
        Node<Integer> root = null;

        root = new Node<>(15);
        root.left = new Node<>(10);
        root.right = new Node<>(20);
        root.left.left = new Node<>(8);
        root.left.right = new Node<>(12);
        root.left.right.left = new Node<>(120);
        root.right.left = new Node<>(16);
        root.right.right = new Node<>(25);

        new BinaryTreePrinter<Integer>(root).print(System.out);
        System.out.print("The height of the binary tree is " + height(root));
    }
}
