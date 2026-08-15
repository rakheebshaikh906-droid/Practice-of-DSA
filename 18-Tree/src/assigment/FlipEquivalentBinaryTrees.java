package assigment;

//https://leetcode.com/problems/flip-equivalent-binary-trees/description/
//951. Flip Equivalent Binary Trees

public class FlipEquivalentBinaryTrees {

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

    static boolean flipEquiv(TreeNode root1, TreeNode root2) {

        if (root1 == null && root2 == null) {
            return true;
        }

        if (root1 == null || root2 == null) {
            return false;
        }

        if (root1.val != root2.val) {
            return false;
        }

        boolean noFlip = flipEquiv(root1.left, root2.left) &&
                         flipEquiv(root1.right, root2.right);

        boolean flip = flipEquiv(root1.left, root2.right) &&
                       flipEquiv(root1.right, root2.left);

        return noFlip || flip;
    }

    public static void main(String[] args) {

        /*
              Tree 1
                 1
               /   \
              2     3
             /       \
            4         5

              Tree 2
                 1
               /   \
              3     2
             /     /
            5     4
        */

        TreeNode root1 = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4),
                        null
                ),
                new TreeNode(3,
                        null,
                        new TreeNode(5)
                )
        );

        TreeNode root2 = new TreeNode(1,
                new TreeNode(3,
                        new TreeNode(5),
                        null
                ),
                new TreeNode(2,
                        new TreeNode(4),
                        null
                )
        );

        boolean result = flipEquiv(root1, root2);

        System.out.println("Flip Equivalent: " + result);
    }
}