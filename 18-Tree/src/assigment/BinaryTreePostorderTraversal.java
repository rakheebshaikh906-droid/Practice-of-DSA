package assigment;

//https://leetcode.com/problems/binary-tree-postorder-traversal/submissions/1938657352/?envType=problem-list-v2&envId=depth-first-search
//145. Binary Tree Postorder Traversal

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {

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

    static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper(root, result);
        return result;
    }

    static void helper(TreeNode node, List<Integer> result) {

        if (node == null) {
            return;
        }

        helper(node.left, result);   // Left
        helper(node.right, result);  // Right
        result.add(node.val);        // Root
    }

    public static void main(String[] args) {

        /*
                1
                 \
                  2
                 /
                3

        Postorder = 3 2 1
        */

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> result = postorderTraversal(root);

        System.out.println("Postorder Traversal: " + result);
    }
}