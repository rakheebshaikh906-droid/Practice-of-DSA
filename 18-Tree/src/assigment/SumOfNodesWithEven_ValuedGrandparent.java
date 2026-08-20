package assigment;

//https://leetcode.com/problems/sum-of-nodes-with-even-valued-grandparent/description/?envType=problem-list-v2&envId=depth-first-search
//1315. Sum of Nodes with Even-Valued Grandparent

public class SumOfNodesWithEven_ValuedGrandparent {
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
    static int sumEvenGrandParent(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.left!=null && root.left.left != null && root.val % 2 == 0) {
            sum += root.left.left.val;
        }

        if (root.left!=null && root.left.right != null && root.val % 2 ==0){
            sum += root.left.right.val;
        }

        if (root.right!=null && root.right.left!= null && root.val % 2 == 0) {
            sum += root.right.left.val;
        }
        if (root.right!=null && root.right.right!= null && root.val % 2 == 0) {
            sum += root.right.right.val;
        }

        sumEvenGrandParent(root.left);
        sumEvenGrandParent(root.right);

        return sum;
    }
    public static void main(String[] args) {

        /*
                6
               / \
              7   8
             / \ / \
            2  7 1  3
           / \
          9   1

        Even grandparent nodes: 6 and 8
        Sum = 2 + 7 + 1 + 3 = 13
        */

        TreeNode root = new TreeNode(6,
                new TreeNode(7,
                        new TreeNode(2,
                                new TreeNode(9),
                                new TreeNode(1)
                        ),
                        new TreeNode(7)
                ),
                new TreeNode(8,
                        new TreeNode(1),
                        new TreeNode(3)
                )
        );

        int result = sumEvenGrandParent(root);

        System.out.println("Sum of nodes with even valued grandparent: " + result);
    }
}
