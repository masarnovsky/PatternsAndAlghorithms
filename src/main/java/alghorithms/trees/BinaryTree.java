package alghorithms.trees;

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
                current.data = findSmalelstValue(current.right);
                current.right = removeRecursive(current.right, data);
                return current;
            }
        }

        return current.data > data ? removeRecursive(current.left, data) : removeRecursive(current.right, data);
    }

    private int findSmalelstValue(Node current) {
       return root.left == null ? root.data : findSmalelstValue(root.left);
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
