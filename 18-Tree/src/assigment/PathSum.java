package assigment;

//https://leetcode.com/problems/path-sum/description/
//112. Path Sum

public class PathSum {
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
    static boolean hasPathSum(TreeNode root,int targetSum){
        if(root==null){
            return false;
        }
        if(root.val==targetSum && root.left==null && root.right==null){
            return true;
        }
        return hasPathSum(root.left,targetSum-root.val) ||  hasPathSum(root.right,targetSum-root.val);
    }

    static void main(String[] args) {
          /*
                 5
                / \
               4   8
              /   / \
             11  13  4
            /  \
           7    2
        */

        TreeNode root = new TreeNode(5,
                new TreeNode(4,
                        new TreeNode(11,
                                new TreeNode(7),
                                new TreeNode(2)
                        ),
                        null
                ),
                new TreeNode(8,
                        new TreeNode(13),
                        new TreeNode(4)
                )
        );

        int targetSum = 22;

        boolean result = hasPathSum(root, targetSum);

        System.out.println(result);
    }
}
