package assigment;

//https://leetcode.com/problems/convert-bst-to-greater-tree/
//538. Convert BST to Greater Tree

public class ConvertBSTToGreaterTree {
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

    static int sum = 0;

    static TreeNode convertBST(TreeNode root) {
        if (root != null) {

            convertBST(root.right);

            root.val += sum;
            sum = root.val;

            convertBST(root.left);
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

        convertBST(root);

        System.out.print("Inorder after GST conversion: ");
        printInorder(root);
    }
}
