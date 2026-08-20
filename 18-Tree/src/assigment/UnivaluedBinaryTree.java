package assigment;

//https://leetcode.com/problems/univalued-binary-tree/description/?envType=problem-list-v2&envId=breadth-first-search
//965. Univalued Binary Tree

public class UnivaluedBinaryTree {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    static boolean isUnivalTree(TreeNode root) {

        if (root == null) {
            return true;
        }

        if (root.left != null && root.left.val != root.val) {
            return false;
        }

        if (root.right != null && root.right.val != root.val) {
            return false;
        }

        return isUnivalTree(root.left) && isUnivalTree(root.right);
    }

    public static void main(String[] args) {

        /*
                1
               / \
              1   1
             / \
            1   1
        */

        TreeNode root = new TreeNode(1,
                new TreeNode(1,
                        new TreeNode(1),
                        new TreeNode(1)
                ),
                new TreeNode(1)
        );

        boolean result = isUnivalTree(root);

        System.out.println("Is Unival Tree: " + result);
    }
}