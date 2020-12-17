package ds.tree;

public class BinaryTreeDiameter {

    public static int diameter(Node<Integer> node) {
        if (node == null)
            return 0;
        return Math.max(BinaryTreeHeight.height(node.left) + BinaryTreeHeight.height(node.right) + 1,
                Math.max(diameter(node.left), diameter(node.right)));
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
        System.out.print("The diameter of the binary tree is " + diameter(root));
    }

}
