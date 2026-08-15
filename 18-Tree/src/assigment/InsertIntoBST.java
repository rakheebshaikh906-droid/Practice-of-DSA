package assigment;

//https://leetcode.com/problems/insert-into-a-binary-search-tree/description/
//701. Insert into a Binary Search Tree

public class InsertIntoBST {

    // Definition for a binary tree node.
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    // Same insertion logic
    public static TreeNode insertIntoBST(TreeNode root, int val) {

        // base case
        if (root == null) {
            return new TreeNode(val);
        }

        if (val < root.val) {
            root.left = insertIntoBST(root.left, val);
        }

        if (val > root.val) {
            root.right = insertIntoBST(root.right, val);
        }

        return root;
    }

    //optional
    // Inorder traversal (BST print)
    public static void inorder(TreeNode root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    // IntelliJ run point
    public static void main(String[] args) {

        /*
             8
            / \
           3  10
          / \   \
         1   6   14
        */

        TreeNode root = null;

        int[] values = {8, 3, 10, 1, 6, 14};

        for (int v : values) {
            root = insertIntoBST(root, v);
        }

        // Insert new value
        root = insertIntoBST(root, 5);

        System.out.print("Inorder Traversal after insertion: ");
        inorder(root);
    }
}
