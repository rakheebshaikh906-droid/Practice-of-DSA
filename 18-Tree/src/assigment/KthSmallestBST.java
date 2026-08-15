package assigment;

//https://leetcode.com/problems/kth-smallest-element-in-a-bst/description/
//230. Kth Smallest Element in a BST

public class KthSmallestBST {

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

    // Global counter
    static int count = 0;
    static int answer = -1;

    static int kthSmallest(TreeNode root, int k) {
        count = 0;      // reset before every call
        answer = -1;
        inorder(root, k);
        return answer;
    }

    static void inorder(TreeNode root, int k) {
        if (root == null) return;

        inorder(root.left, k);

        count++;
        if (count == k) {
            answer = root.val;
            return;
        }

        inorder(root.right, k);
    }

    public static void main(String[] args) {

        /*
                 5
                / \
               3   6
              / \
             2   4
            /
           1
        */

        TreeNode root = new TreeNode(5,
                new TreeNode(3,
                        new TreeNode(2,
                                new TreeNode(1),
                                null
                        ),
                        new TreeNode(4)
                ),
                new TreeNode(6)
        );

        int k = 3;
        int result = kthSmallest(root, k);

        System.out.println("Kth Smallest Element: " + result);
    }
}