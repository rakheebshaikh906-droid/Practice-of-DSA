package assigment;

//https://leetcode.com/problems/leaf-similar-trees/description/?envType=problem-list-v2&envId=depth-first-search
//872. Leaf-Similar Trees

import java.util.*;

public class LeafSimilarTrees {

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

        public boolean leafSimilar(TreeNode root1, TreeNode root2) {
            List<Integer> list1 = new ArrayList<>();
            List<Integer> list2 = new ArrayList<>();

            dfs(root1, list1);
            dfs(root2, list2);

            return list1.equals(list2);
        }

        void dfs(TreeNode node, List<Integer> list) {
            if (node == null) {
                return;
            }

            if (node.left == null && node.right == null) {
                list.add(node.val);
            }

            dfs(node.left, list);
            dfs(node.right, list);
        }
    }

    public static void main(String[] args) {

        TreeNode root1 = new TreeNode(3,
                new TreeNode(5,
                        new TreeNode(6),
                        new TreeNode(2,
                                new TreeNode(7),
                                new TreeNode(4))),
                new TreeNode(1,
                        new TreeNode(9),
                        new TreeNode(8)));

        TreeNode root2 = new TreeNode(3,
                new TreeNode(5,
                        new TreeNode(6),
                        new TreeNode(7)),
                new TreeNode(1,
                        new TreeNode(4),
                        new TreeNode(2,
                                new TreeNode(9),
                                new TreeNode(8))));

        Solution sol = new Solution();
        boolean result = sol.leafSimilar(root1, root2);

        System.out.println("Leaf Similar: " + result);
    }
}