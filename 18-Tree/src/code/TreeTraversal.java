package code;

public class TreeTraversal {

    // Node class
    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    // Preorder Traversal: Root -> Left -> Right
    static void preorder(Node node) {
        if (node == null) return;

        System.out.print(node.val + " ");
        preorder(node.left);
        preorder(node.right);
    }

    // Inorder Traversal: Left -> Root -> Right
    static void inorder(Node node) {
        if (node == null) return;

        inorder(node.left);
        System.out.print(node.val + " ");
        inorder(node.right);
    }

    // Postorder Traversal: Left -> Right -> Root
    static void postorder(Node node) {
        if (node == null) return;

        postorder(node.left);
        postorder(node.right);
        System.out.print(node.val + " ");
    }

    public static void main(String[] args){
          /*
                Tree structure:
                        1
                       / \
                      2   3
                     / \
                    4   5
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Preorder Traversal:");
        preorder(root);

        System.out.println("\n\nInorder Traversal:");
        inorder(root);

        System.out.println("\n\nPostorder Traversal:");
        postorder(root);
    }
}
