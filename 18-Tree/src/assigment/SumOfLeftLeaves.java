package assigment;

//https://leetcode.com/problems/sum-of-left-leaves/description/?envType=problem-list-v2&envId=depth-first-search
//404. Sum of Left Leaves

public class SumOfLeftLeaves {
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
    static int sum=0;
    static int sumOfLeftLeaves(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.left!=null && root.left.left==null && root.left.right==null){
            sum+=root.left.val;
        }
        sumOfLeftLeaves(root.left);
        sumOfLeftLeaves(root.right);
        return sum;


    }
    public static void main(String[] args) {

        /*
                3
               / \
              9  20
                /  \
               15   7

        Left leaves = 9 + 15 = 24
        */

        TreeNode root = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20,
                        new TreeNode(15),
                        new TreeNode(7)
                )
        );

        SumOfLeftLeaves obj = new SumOfLeftLeaves();

        int result = obj.sumOfLeftLeaves(root);

        System.out.println("Sum of Left Leaves: " + result);
    }
}
