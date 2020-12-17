package ds.tree;

import java.util.Scanner;

public class BinaryTree {

    private static Scanner scan = null;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        Node<Integer> rootNode = createTree(scan);
        inOrder(rootNode);
        preOrder(rootNode);
        postOrder(rootNode);
        new BinaryTreePrinter<Integer>(rootNode).print(System.out);
    }

    public static Node<Integer> createTree(Scanner scanner) {
        Node<Integer> root = null;
        System.out.println("Please enter node data : ");
        int data = scanner.nextInt();

        if (-1 == data) {
            return null;
        }
        root = new Node<Integer>(data);

        System.out.println("Please enter left node data for node: " + data);
        root.left = createTree(scanner);

        System.out.println("Please enter right node data for node: " + data);
        root.right = createTree(scanner);

        return root;
    }

    public static void inOrder(Node<Integer> node) {
        if (node == null)
            return;

        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
        System.out.println();
    }

    public static void preOrder(Node<Integer> node) {
        if (node == null)
            return;

        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
        System.out.println();
    }

    public static void postOrder(Node<Integer> node) {
        if (node == null)
            return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
        System.out.println();
    }
}
