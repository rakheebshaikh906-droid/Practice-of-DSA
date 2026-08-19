package assigment;

//https://leetcode.com/problems/same-tree/description/
//100. Same Tree

public class SameTree {
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
    static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return true;
        }
        if(p == null || q==null){
            return false;
        }
        return p.val==q.val && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);

    }
    public static void main(String[] args) {

        /*
              Tree 1:
                   1
                  / \
                 2   3

              Tree 2:
                   1
                  / \
                 2   3
        */

        TreeNode t1 = new TreeNode(1,
                new TreeNode(2),
                new TreeNode(3)
        );

        TreeNode t2 = new TreeNode(1,
                new TreeNode(2),
                new TreeNode(3)
        );

        boolean result = isSameTree(t1, t2);

        System.out.println("Are both trees same: " + result);
    }
}
