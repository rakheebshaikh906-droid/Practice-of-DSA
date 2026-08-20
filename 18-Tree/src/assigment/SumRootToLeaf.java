package assigment;

//https://leetcode.com/problems/sum-root-to-leaf-numbers/description/
//129. Sum Root to Leaf Numbers

public class SumRootToLeaf {
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
    static int sumNumbers(TreeNode root) {
        return helper(root,0);
    }
    static int helper(TreeNode node,int sum){
        if(node==null){
            return 0;
        }
        sum=sum*10+node.val;

        if(node.left==null && node.right==null){
            return sum;
        }
        return helper(node.left,sum)+helper(node.right,sum);
    }

    static void main(String[] args){
          /*
                4
               / \
              9   0
             / \
            5   1
        */
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(9);
        root.right = new TreeNode(0);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(1);

        int result = sumNumbers(root);

        System.out.println("Sum of Root-to-Leaf Numbers: " + result);
    }
}
