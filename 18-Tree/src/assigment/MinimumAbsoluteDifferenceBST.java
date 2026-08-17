package assigment;

//https://leetcode.com/problems/minimum-absolute-difference-in-bst/description/
//530. Minimum Absolute Difference in BST

import java.util.ArrayList;
import java.util.List;

public class MinimumAbsoluteDifferenceBST {

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

    static int getMinimumDifference(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        inOrder(root, list);

        int min = Integer.MAX_VALUE;

        for (int i = 1; i < list.size(); i++) {
            min = Math.min(min, list.get(i) - list.get(i - 1));
        }

        return min;
    }

    static void inOrder(TreeNode node, List<Integer> result) {

        if (node == null) {
            return;
        }

        inOrder(node.left, result);
        result.add(node.val);
        inOrder(node.right, result);
    }

    public static void main(String[] args) {

        /*
                4
               / \
              2   6
             / \
            1   3

        Inorder → 1 2 3 4 6
        Min diff = 1
        */

        TreeNode root = new TreeNode(4,
                new TreeNode(2,
                        new TreeNode(1),
                        new TreeNode(3)
                ),
                new TreeNode(6)
        );

        int result = getMinimumDifference(root);

        System.out.println("Minimum absolute different"+ result);
    }
}