package assigment;

//https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
//105. Construct Binary Tree from Preorder and Inorder Traversal

import java.util.Arrays;
public class BuildTreeFromTraversals {

    // TreeNode class
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static TreeNode buildTree(int[] preorder, int[] inorder) {

        if (preorder.length == 0) {
            return null;
        }

        int rootValue = preorder[0];
        int index = 0;

        // Find root index in inorder
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == rootValue) {
                index = i;
                break;
            }
        }

        TreeNode node = new TreeNode(rootValue);

        node.left = buildTree(
                Arrays.copyOfRange(preorder, 1, index + 1),
                Arrays.copyOfRange(inorder, 0, index)
        );

        node.right = buildTree(
                Arrays.copyOfRange(preorder, index + 1, preorder.length),
                Arrays.copyOfRange(inorder, index + 1, inorder.length)
        );

        return node;
    }

    // Inorder print to verify tree
    public static void printInorder(TreeNode root) {
        if (root == null) return;
        printInorder(root.left);
        System.out.print(root.val + " ");
        printInorder(root.right);
    }

    public static void main(String[] args) {

        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};

        TreeNode root = buildTree(preorder, inorder);

        System.out.print("Constructed Tree Inorder: ");
        printInorder(root);
    }
}