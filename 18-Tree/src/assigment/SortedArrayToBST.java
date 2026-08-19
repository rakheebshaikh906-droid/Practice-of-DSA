package assigment;

//https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
//108. Convert Sorted Array to Binary Search Tree

import java.util.*;
public class SortedArrayToBST {

    // TreeNode definition
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

    // Same logic as your LeetCode solution
    public static TreeNode sortedArrayToBST(int[] nums) {
        return sortedBinaryTree(nums, 0, nums.length - 1);
    }

    private static TreeNode sortedBinaryTree(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;

        TreeNode root = new TreeNode(nums[mid]);

        root.left = sortedBinaryTree(nums, start, mid - 1);
        root.right = sortedBinaryTree(nums, mid + 1, end);

        return root;
    }

    public static void main(String[] args) {

        int[] nums = {-10, -3, 0, 5, 9};

        TreeNode root = sortedArrayToBST(nums);

        // Level Order Print (LeetCode style output)
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print(node.val + " ");

            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
        }
    }
}