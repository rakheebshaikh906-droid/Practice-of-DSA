package assigment;

//https://leetcode.com/problems/validate-binary-search-tree/
//98. Validate Binary Search Tree

public class ValidateBST {

    // TreeNode class
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

    // Solution class
    static class Solution {

        public boolean isValidBST(TreeNode root) {
            return helper(root, null, null);
        }

        public boolean helper(TreeNode node, Integer low, Integer high) {

            if (node == null) {
                return true;
            }

            if (low != null && node.val <= low) {
                return false;
            }

            if (high != null && node.val >= high) {
                return false;
            }

            boolean TreeLeft = helper(node.left, low, node.val);
            boolean TreeRight = helper(node.right, node.val, high);

            return TreeLeft && TreeRight;
        }
    }

    public static void main(String[] args) {

        // Example 1 (Valid BST)
        //        5
        //       / \
        //      3   7
        //     / \   \
        //    2   4   8

        TreeNode root = new TreeNode(5,
                new TreeNode(3,
                        new TreeNode(2),
                        new TreeNode(4)
                ),
                new TreeNode(7,
                        null,
                        new TreeNode(8)
                )
        );

        Solution sol = new Solution();
        System.out.println("Is Valid BST? " + sol.isValidBST(root));


        // Example 2 (Invalid BST)
        //        5
        //       / \
        //      3   7
        //         /
        //        4  (Invalid because 4 < 5 but in right subtree)

        TreeNode root2 = new TreeNode(5,
                new TreeNode(3),
                new TreeNode(7,
                        new TreeNode(4),
                        null
                )
        );

        System.out.println("Is Valid BST? " + sol.isValidBST(root2));
    }
}