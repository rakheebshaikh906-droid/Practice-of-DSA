package assigment;

//https://leetcode.com/contest/weekly-contest-511/problems/count-dominant-nodes-in-a-binary-tree/description/
//Q2. Count Dominant Nodes in a Binary Tree

public class CountDominantNodesInABinaryTree {
     static void main(String[] args) {

        // Input: [5,3,8,2,4,7,1]

        TreeNode root = new TreeNode(5);

        root.left = new TreeNode(3);
        root.right = new TreeNode(8);

        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);

        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(1);

        Solution obj = new Solution();

        int ans = obj.countDominantNodes(root);

        System.out.println(ans);
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

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

        int count = 0;

        public int countDominantNodes(TreeNode root) {
            if (root == null) {
                return 0;
            }

            findMax(root);

            return count;
        }

        public int findMax(TreeNode node) {

            if (node == null) {
                return 0;
            }

            int left = findMax(node.left);
            int right = findMax(node.right);

            if (node.val >= Math.max(left, right)) {
                count++;
            }

            return Math.max(node.val, Math.max(left, right));
        }
    }
}
