package assigment;

//https://leetcode.com/problems/binary-tree-preorder-traversal/description/?envType=problem-list-v2&envId=depth-first-search
//144. Binary Tree Preorder Traversal

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {

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

    static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper(root, result);
        return result;
    }

    static void helper(TreeNode node, List<Integer> result) {

        if (node == null) {
            return;
        }

        result.add(node.val);      // Root
        helper(node.left, result); // Left
        helper(node.right, result);// Right
    }

    public static void main(String[] args) {

        /*
                1
                 \
                  2
                 /
                3

        Preorder = 1 2 3
        */

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> result = preorderTraversal(root);

        System.out.println("Preorder Traversal: " + result);
    }
}