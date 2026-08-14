package assigment;

//https://leetcode.com/problems/diameter-of-binary-tree/description/
//543. Diameter of Binary Tree

public class DiameterOfBinaryTree {
    static class TreeNode{
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

    static int diameter=0;
    static int diameterOfBinaryTree(TreeNode root){
        height(root);
        return diameter-1;
    }
   public static int height(TreeNode node){
        if(node==null){
            return 0;
        }
        int leftHeight=height(node.left);
        int rightHeight=height(node.right);

        int dia=leftHeight+rightHeight+1;
        diameter=Math.max(diameter,dia);

        return Math.max(leftHeight,rightHeight)+1;

   }
    static void main(String[] args) {

            // Tree:
            //         1
            //       /   \
            //      2     3
            //     / \
            //    4   5

            TreeNode root = new TreeNode(1);
            root.left = new TreeNode(2);
            root.right = new TreeNode(3);
            root.left.left = new TreeNode(4);
            root.left.right = new TreeNode(5);

            System.out.println(diameterOfBinaryTree(root));  // Output: 3
    }
}
