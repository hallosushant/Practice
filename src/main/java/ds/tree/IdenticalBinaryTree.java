package ds.tree;

import java.util.Scanner;

public class IdenticalBinaryTree {

    private static Scanner scan = null;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        Node<Integer> node1 = BinaryTree.createTree(scan);
        new BinaryTreePrinter<Integer>(node1).print(System.out);

        Node<Integer> node2 = BinaryTree.createTree(scan);
        new BinaryTreePrinter<Integer>(node2).print(System.out);

        if (Boolean.TRUE.equals(compareNode(node1, node2))) {
            System.out.println("Identical");
        } else {
            System.out.println("Not Identical");
        }

    }

    private static boolean compareNode(Node<Integer> node1, Node<Integer> node2) {
        if (null == node1 && null == node2) {
            return true;
        }
        boolean isIdentical = false;
        if (null != node1 && null != node2) {
            System.out.println(node1.data + " ? " + node2.data);
            isIdentical = node1.data == node2.data && compareNode(node1.left, node2.left)
                    && compareNode(node1.right, node2.right);
        }
        return isIdentical;
    }
}
