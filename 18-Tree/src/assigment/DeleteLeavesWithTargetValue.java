package assigment;

//https://leetcode.com/problems/delete-leaves-with-a-given-value/
//1325. Delete Leaves With a Given Value

public class DeleteLeavesWithTargetValue {

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

    static TreeNode removeLeafNodes(TreeNode root, int target) {

        if (root == null) {
            return null;
        }

        root.left = removeLeafNodes(root.left, target);
        root.right = removeLeafNodes(root.right, target);

        if (root.left == null && root.right == null && root.val == target) {
            return null;
        }

        return root;
    }

    // Inorder traversal to see result
    static void printInorder(TreeNode root) {
        if (root == null) return;

        printInorder(root.left);
        System.out.print(root.val + " ");
        printInorder(root.right);
    }

    public static void main(String[] args) {

        /*
                1
               / \
              2   3
             / \   \
            2   2   4

        target = 2
        */

        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(2),
                        new TreeNode(2)
                ),
                new TreeNode(3,
                        null,
                        new TreeNode(4)
                )
        );

        int target = 2;

        root = removeLeafNodes(root, target);

        System.out.print("Tree after deletion (Inorder): ");
        printInorder(root);
    }
}