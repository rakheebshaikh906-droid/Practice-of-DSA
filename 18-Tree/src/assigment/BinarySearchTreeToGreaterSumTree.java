package assigment;

//https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/?envType=problem-list-v2&envId=depth-first-search
//1038. Binary Search Tree to Greater Sum Tree

public class BinarySearchTreeToGreaterSumTree{
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
    static TreeNode bstToGst(TreeNode root) {
        if(root!=null){
            bstToGst(root.right);
            root.val+=sum;
            sum=root.val;
            bstToGst(root.left);
        }
        return root;
    }

    // Inorder print to check result
    static void printInorder(TreeNode root) {
        if (root == null) return;
        printInorder(root.left);
        System.out.print(root.val + " ");
        printInorder(root.right);
    }

    public static void main(String[] args) {

        /*
                4
               / \
              1   6
             / \ / \
            0  2 5  7
                \     \
                 3     8
        */

        TreeNode root = new TreeNode(4,
                new TreeNode(1,
                        new TreeNode(0),
                        new TreeNode(2,
                                null,
                                new TreeNode(3)
                        )
                ),
                new TreeNode(6,
                        new TreeNode(5),
                        new TreeNode(7,
                                null,
                                new TreeNode(8)
                        )
                )
        );

        bstToGst(root);

        System.out.print("Inorder after GST conversion: ");
        printInorder(root);
    }

}