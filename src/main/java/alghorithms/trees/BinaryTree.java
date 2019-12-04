package alghorithms.trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    private Node root;

    public BinaryTree(int data) {
        root = new Node(data);
    }

    public void insert(int data) {
        root = addRecursive(root, data);
    }

    private Node addRecursive(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }

        if (current.data > data) {
            current.left = addRecursive(current.left, data);
        } else if (current.data < data) {
            current.right = addRecursive(current.right, data);
        } else {
            return current;
        }

        return current;
    }

    public boolean contains(int data) {
        return containsRecursive(root, data);
    }

    private boolean containsRecursive(Node current, int data) {
        if (current == null)
            return false;
        if (current.data == data)
            return true;

        return current.data > data ? containsRecursive(current.left, data) :
                containsRecursive(current.right, data);
    }

    public void remove(int data) {
        root = removeRecursive(root, data);
    }

    private Node removeRecursive(Node current, int data) {
        if (current == null)
            return current;

        if (current.data == data) {
            if (current.left == null && current.right == null) {
                return null;
            }

            if (current.right == null) {
                return current.left;
            }

            if (current.left == null) {
                return current.right;
            }

            if (current.left != null && current.right != null) {
                int smallestValue = findSmallestValue(current.right);
                current.data = smallestValue;
                current.right = removeRecursive(current.right, smallestValue);
                return current;
            }
        }

        return current.data > data ? removeRecursive(current.left, data) : removeRecursive(current.right, data);
    }

    private int findSmallestValue(Node node) {
        return node.left == null ? node.data : findSmallestValue(node.left);
    }

    public void inOrderTraversal() {
        inOrderTraversal(root);
        postOrderTraversal(root);
    }

    public void preOrderTraversal() {
        preOrderTraversal(root);
    }

    public void postOrderTraversal() {
        postOrderTraversal(root);
    }

    private void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.println(node.data);
            inOrderTraversal(node.right);
        }
    }

    private void preOrderTraversal(Node node) {
        if (node != null) {
            System.out.println(node.data);
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    private void postOrderTraversal(Node node) {
        if (node != null) {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.println(node.data);
        }
    }

    public void traverseLevelOrder() {
        if (root == null)
            return;

        Queue<Node> nodes = new LinkedList<>();
        nodes.add(root);

        while (!nodes.isEmpty()) {
            Node node = nodes.remove();
            System.out.println(node.data);

            if (node.left != null) {
                nodes.add(node.left);
            }
            if (node.right != null) {
                nodes.add(node.right);
            }
        }
    }
}

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}
