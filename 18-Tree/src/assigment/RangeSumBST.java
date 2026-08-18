package assigment;

//https://leetcode.com/problems/range-sum-of-bst/description/
//938. Range Sum of BST

public class RangeSumBST {

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

        //solution function
        public int rangeSumBST(TreeNode root, int low, int high) {
            if(root==null){
                return 0;
            }
            int sum=0;

            if(root.val>=low && root.val<=high){
                sum+=root.val;
            }
            sum+=rangeSumBST(root.left,low,high);
            sum+=rangeSumBST(root.right,low,high);

            return sum;
        }
    }

    public static void main(String[] args) {

        /*
                  10
                 /  \
                5    15
               / \     \
              3   7     18
         */

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);

        root.right.right = new TreeNode(18);

        Solution solution = new Solution();

        int low = 7;
        int high = 15;

        int ans = solution.rangeSumBST(root, low, high);

        System.out.println("Range Sum = " + ans);
    }
}