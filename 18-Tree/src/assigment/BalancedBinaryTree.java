package assigment;

//https://leetcode.com/problems/balanced-binary-tree/
//110. Balanced Binary Tree

public class BalancedBinaryTree {

    // Definition for a binary tree node.
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    // Same height method
    private static int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(height(node.left), height(node.right));
    }

    // Same isBalanced logic
    private static boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        return Math.abs(height(root.left) - height(root.right)) <= 1
                && isBalanced(root.left)
                && isBalanced(root.right);
    }

    // main method (IntelliJ run point)
    public static void main(String[] args) {

        /*
              1
             / \
            2   3
           /
          4
         */

        TreeNode root = new TreeNode(
                1,
                new TreeNode(
                        2,
                        new TreeNode(4),
                        null
                ),
                new TreeNode(3)
        );

        System.out.println(isBalanced(root));

    }
}
