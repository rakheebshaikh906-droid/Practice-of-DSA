package assigment;

//https://leetcode.com/problems/maximum-binary-tree/
//654. Maximum Binary Tree

public class MaximumBinaryTree {

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

    static class Solution {

        //solution function
        public TreeNode constructMaximumBinaryTree(int[] nums) {
            if (nums == null || nums.length == 0) {
                return null;
            }
            return build(nums, 0, nums.length - 1);
        }

        private TreeNode build(int[] nums, int start, int end) {
            if (start > end) {
                return null;
            }

            int max = start;
            for (int i = start + 1; i <= end; i++) {
                if (nums[i] > nums[max]) {
                    max = i;
                }
            }

            TreeNode root = new TreeNode(nums[max]);

            root.left = build(nums, start, max - 1);
            root.right = build(nums, max + 1, end);

            return root;
        }
    }

    // Preorder Traversal
    static void preorder(TreeNode root) {
        if (root == null) return;

        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {3, 2, 1, 6, 0, 5};

        TreeNode root = solution.constructMaximumBinaryTree(nums);

        System.out.print("Preorder Traversal: ");
        preorder(root);
    }
}