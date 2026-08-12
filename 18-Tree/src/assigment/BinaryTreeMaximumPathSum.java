package assigment;

//https://leetcode.com/problems/binary-tree-maximum-path-sum/description/
//124. Binary Tree Maximum Path Sum

public class BinaryTreeMaximumPathSum {
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
    static int ans=Integer.MIN_VALUE;
    static int maxPathSum(TreeNode root) {
        helper(root);
        return ans;
    }
    static int helper(TreeNode node){
        if(node==null){
            return 0;
        }
        int left=helper(node.left);
        int right=helper(node.right);

        //ignore negative
        left=Math.max(0,left);
        right=Math.max(0,right);

        int pathSum=left+right+node.val;

        ans=Math.max(ans,pathSum);

        return Math.max(left,right)+node.val;

    }

    public static void main(String[] args) {

        /*
                 -10
                 /  \
                9   20
                   /  \
                  15   7

           Maximum Path = 15 + 20 + 7 = 42
        */

        TreeNode root = new TreeNode(-10,
                new TreeNode(9),
                new TreeNode(20,
                        new TreeNode(15),
                        new TreeNode(7)
                )
        );

        int result = maxPathSum(root);

        System.out.println("Maximum Path Sum: " + result);
    }
}
