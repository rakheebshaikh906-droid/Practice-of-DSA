package assigment;

//https://leetcode.com/problems/subtree-of-another-tree/description/?envType=problem-list-v2&envId=depth-first-search
//572. Subtree of Another Tree

public class SubtreeOfAnotherTree {

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

    static boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if (root == null) {
            return false;
        }

        if (isIdentical(root, subRoot)) {
            return true;
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    static boolean isIdentical(TreeNode s, TreeNode t) {

        if (s == null && t == null) {
            return true;
        }

        if (s == null || t == null) {
            return false;
        }

        if (s.val == t.val &&
                isIdentical(s.left, t.left) &&
                isIdentical(s.right, t.right)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        /*
                Root Tree
                    3
                   / \
                  4   5
                 / \
                1   2

                SubRoot
                  4
                 / \
                1   2
        */

        TreeNode root = new TreeNode(3,
                new TreeNode(4,
                        new TreeNode(1),
                        new TreeNode(2)
                ),
                new TreeNode(5)
        );

        TreeNode subRoot = new TreeNode(4,
                new TreeNode(1),
                new TreeNode(2)
        );

        boolean result = isSubtree(root, subRoot);

        System.out.println("Is Subtree: " + result);
    }
}