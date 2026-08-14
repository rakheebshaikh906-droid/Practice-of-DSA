package assigment;

//https://leetcode.com/problems/deepest-leaves-sum/description/?envType=problem-list-v2&envId=breadth-first-search
//1302. Deepest Leaves Sum

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DeepestLeavesSum {
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
    static int deepestLeavesSum(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int sum=0;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            sum=0;

            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                sum+= currentNode.val;

                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }

        }
        return sum;
    }
    static void main(String[] args) {

        /*
                1
               / \
              2   3
             / \
            4   5

           Deepest level = 4 + 5 = 9
        */

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        int result = deepestLeavesSum(root);

        System.out.println("Deepest Leaves Sum: " + result);
    }
}
