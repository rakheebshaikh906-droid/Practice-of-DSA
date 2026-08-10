package code;

import java.util.*;

public class ArrayInsertionInSortedBST {

    // Tree Node definition
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    // Function to convert sorted array to BST
    public static TreeNode populatedSorted(int[] nums) {
        return populatedSorted(nums, 0, nums.length - 1);
    }

    private static TreeNode populatedSorted(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;

        TreeNode node = new TreeNode(nums[mid]);

        node.left = populatedSorted(nums, start, mid - 1);
        node.right = populatedSorted(nums, mid + 1, end);

        return node;
    }

    // Display tree (rotated view)
    public static void display(TreeNode node, String indent) {
        if (node == null) {
            return;
        }

        display(node.right, indent + "    ");
        System.out.println(indent + node.val);
        display(node.left, indent + "    ");
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter sorted elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        TreeNode root = populatedSorted(nums);

        System.out.println("\nBST Output:");
        display(root, "");
    }
}
