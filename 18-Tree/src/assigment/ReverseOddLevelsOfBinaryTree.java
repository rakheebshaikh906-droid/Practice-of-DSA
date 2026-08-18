package assigment;

//https://leetcode.com/problems/reverse-odd-levels-of-binary-tree/description/?envType=problem-list-v2&envId=breadth-first-search
//2415. Reverse Odd Levels of Binary Tree

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ReverseOddLevelsOfBinaryTree {
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

    static TreeNode reverseOddLevels(TreeNode root) {
        if (root == null) {
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;

        while (!queue.isEmpty()) {

            int size = queue.size();
            List<TreeNode> nodes = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode currentNode = queue.poll();
                nodes.add(currentNode);

                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }

            if (level % 2 == 1) {
                int left = 0;
                int right = nodes.size() - 1;

                while (left < right) {
                    int temp = nodes.get(left).val;
                    nodes.get(left).val = nodes.get(right).val;
                    nodes.get(right).val = temp;
                    left++;
                    right--;
                }
            }

            level++;
        }

        return root;
    }

    // Helper method to print level order
    static void printLevelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            System.out.print(node.val + " ");

            if (node.left != null) q.offer(node.left);
            if (node.right != null) q.offer(node.right);
        }
        System.out.println();
    }
    public static void main(String[] args) {

        // Example Tree:
        //         2
        //       /   \
        //      3     5
        //     / \   / \
        //    8  13 21  34

        TreeNode root = new TreeNode(2,
                new TreeNode(3,
                        new TreeNode(8),
                        new TreeNode(13)),
                new TreeNode(5,
                        new TreeNode(21),
                        new TreeNode(34)));

        System.out.println("Before:");
        printLevelOrder(root);

        reverseOddLevels(root);

        System.out.println("After:");
        printLevelOrder(root);
    }

}
