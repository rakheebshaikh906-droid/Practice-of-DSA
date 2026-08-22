package code;

import java.util.Scanner;

public class FullBinaryTree {

    private static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    // Constructor
    public FullBinaryTree() {
        Scanner sc = new Scanner(System.in);
        root = populate(sc);
    }

    // Populate tree (Full Binary Tree)
    private Node populate(Scanner sc) {
        System.out.print("Enter the value of node: ");
        int value = sc.nextInt();
        Node node = new Node(value);

        System.out.print("Do you want to add children for " + value + " (true/false): ");
        boolean hasChildren = sc.nextBoolean();

        if (hasChildren) {
            System.out.println("Entering LEFT child of " + value);
            node.left = populate(sc);

            System.out.println("Entering RIGHT child of " + value);
            node.right = populate(sc);
        }

        return node;
    }

    // Simple display (Kunal sir style)
    public void display() {
        display(this.root, "");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }

        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    // Pretty display
    public void prettyDisplay() {
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node node, int level) {
        if (node == null) {
            return;
        }

        prettyDisplay(node.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t");
            }
            System.out.println("|---->" + node.value);
        } else {
            System.out.println(node.value);
        }

        prettyDisplay(node.left, level + 1);
    }

    // Main method
    public static void main(String[] args) {
        FullBinaryTree tree = new FullBinaryTree();

        System.out.println("\nNormal Display:");
        tree.display();

        System.out.println("\nPretty Display:");
        tree.prettyDisplay();
    }
}
