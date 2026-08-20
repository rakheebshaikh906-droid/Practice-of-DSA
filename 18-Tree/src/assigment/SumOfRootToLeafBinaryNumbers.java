package assigment;

//https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/description/?envType=problem-list-v2&envId=depth-first-search
//1022. Sum of Root To Leaf Binary Numbers

public class SumOfRootToLeafBinaryNumbers {
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


    static int sumRootToLeaf(TreeNode root) {
        return dfs(root, 0);
    }

    static int dfs(TreeNode node, int current) {
        if (node == null) {
            return 0;
        }

        current = current * 2 + node.val;

        if (node.left == null && node.right == null) {
            return current;
        }

        return dfs(node.left, current) + dfs(node.right, current);
    }
}
