package assigment;

//https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
//114. Flatten Binary Tree to Linked List

public class FlattenBinaryTree {

    // TreeNode class
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

    // Solution class
    static class Solution {
        public void flatten(TreeNode root) {
            TreeNode current = root;

            while (current != null) {
                if (current.left != null) {

                    TreeNode temp = current.left;

                    while (temp.right != null) {
                        temp = temp.right;
                    }

                    temp.right = current.right;
                    current.right = current.left;
                    current.left = null;
                }

                current = current.right;
            }
        }
    }

    // Function to print flattened tree
    public static void printList(TreeNode root) {
        while (root != null) {
            System.out.print(root.val + " -> ");
            root = root.right;
        }
        System.out.println("null");
    }

    // Main method
    public static void main(String[] args) {

        // Creating example tree:
        //        1
        //       / \
        //      2   5
        //     / \   \
        //    3   4   6

        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3),
                        new TreeNode(4)
                ),
                new TreeNode(5,
                        null,
                        new TreeNode(6)
                )
        );

        Solution sol = new Solution();
        sol.flatten(root);

        System.out.println("Flattened Tree:");
        printList(root);
    }
}