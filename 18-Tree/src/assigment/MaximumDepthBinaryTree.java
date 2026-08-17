package assigment;

//https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
//104. Maximum Depth of Binary Tree

public class MaximumDepthBinaryTree {

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

    // Same height logic
    private static int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(height(node.left), height(node.right));
    }

    // maxDepth = height
    public static int maxDepth(TreeNode root) {
        return height(root);
    }

    // IntelliJ run point
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

        System.out.println("Maximum Depth of Tree : " + maxDepth(root));
    }

}
