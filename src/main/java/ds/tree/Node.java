package ds.tree;

public class Node<E> {

    Node<E> left;
    Node<E> right;
    E data;

    public Node(E data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node [left=" + left + ", right=" + right + ", data=" + data + "]";
    }
}
