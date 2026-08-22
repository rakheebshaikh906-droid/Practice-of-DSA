package code;

public class AVLTree {
    // Node class
    static class Node {
        int val;
        int height;
        Node left, right;

        Node(int val) {
            this.val = val;
            this.height = 1;
        }
    }

    // Get height
    static int height(Node node) {
        return (node == null) ? 0 : node.height;
    }

    // Get balance factor
    static int getBalance(Node node) {
        return (node == null) ? 0 : height(node.left) - height(node.right);
    }

    // Right Rotation (LL case)
    static Node rightRotate(Node p) {
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        p.height = Math.max(height(p.left), height(p.right)) + 1;
        c.height = Math.max(height(c.left), height(c.right)) + 1;

        return c;
    }

    // Left Rotation (RR case)
    static Node leftRotate(Node p) {
        Node c = p.right;
        Node t = c.left;

        c.left = p;
        p.right = t;

        p.height = Math.max(height(p.left), height(p.right)) + 1;
        c.height = Math.max(height(c.left), height(c.right)) + 1;

        return c;
    }

    // Insert into AVL Tree
    static Node insert(Node node, int val) {

        // Normal BST insertion
        if (node == null)
            return new Node(val);

        if (val < node.val)
            node.left = insert(node.left, val);
        else if (val > node.val)
            node.right = insert(node.right, val);
        else
            return node; // duplicate not allowed

        // Update height
        node.height = Math.max(height(node.left), height(node.right)) + 1;

        // Get balance factor
        int balance = getBalance(node);

        // 1. Left Left case
        if (balance > 1 && val < node.left.val)
            return rightRotate(node);

        // 2. Right Right case
        if (balance < -1 && val > node.right.val)
            return leftRotate(node);

        // 3. Left Right case
        if (balance > 1 && val > node.left.val) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // 4. Right Left case
        if (balance < -1 && val < node.right.val) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    // Inorder traversal
    static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.val + " ");
            inorder(root.right);
        }
    }

    // Pretty display
    static void display(Node node, String indent, boolean isLeft) {
        if (node == null)
            return;

        System.out.println(indent + (isLeft ? "L-- " : "R-- ") + node.val);
        display(node.left, indent + "   ", true);
        display(node.right, indent + "   ", false);
    }

    // Main method
    public static void main(String[] args) {

        Node root = null;

        // Insert 1 to 30
        for (int i = 1; i <= 30; i++) {
            root = insert(root, i);
        }

        System.out.println("Total Nodes inserted: 30");
        System.out.println("Height of AVL Tree: " + root.height);

        System.out.print("Inorder Traversal: ");
        inorder(root);
        System.out.println();

        System.out.println("\nAVL Tree Structure:");
        display(root, "", false);
    }
}
