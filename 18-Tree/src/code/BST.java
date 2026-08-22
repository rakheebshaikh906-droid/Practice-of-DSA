package code;

class BST {

    private static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    // Insert value
    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {
        if (node == null) {
            return new Node(value);
        }

        if (value < node.value) {
            node.left = insert(value, node.left);
        } else if (value > node.value) {
            node.right = insert(value, node.right);
        }

        return node;
    }

    // Pretty Display (Tree Form)
    public void prettyDisplay() {
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node node, int level) {
        if (node == null) return;

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

    public static void main(String[] args) {
        BST tree = new BST();

        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(3);
        tree.insert(7);

        tree.prettyDisplay();
    }
}
