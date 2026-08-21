package assigment;

//https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/description/
//103. Binary Tree Zigzag Level Order Traversal

import java.util.*;

public class ZigZagLevel{
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }
    }

    static List<List<Integer>> zigZagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Deque<TreeNode> deque = new LinkedList<>();
        deque.offer(root);

        boolean reverse = false;

        while (!deque.isEmpty()) {

            int levelSize = deque.size();
            List<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {

                if (!reverse) {
                    TreeNode currentNode = deque.pollFirst();
                    currentLevel.add(currentNode.val);

                    if (currentNode.left != null) {
                        deque.offerLast(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        deque.offerLast(currentNode.right);
                    }

                } else {
                    TreeNode currentNode = deque.pollLast();
                    currentLevel.add(currentNode.val);

                    if (currentNode.right != null) {
                        deque.offerFirst(currentNode.right);
                    }
                    if (currentNode.left != null) {
                        deque.offerFirst(currentNode.left);
                    }
                }
            }

            reverse = !reverse;  // toggle after full level
            result.add(currentLevel);
        }

        return result;
    }

    public static void main(String[] args) {

        // Tree:
        //          3
        //       /    \
        //      4      8
        //     /  \   /  \
        //    12  14 7    11

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(12);
        root.left.right = new TreeNode(14);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(11);

        List<List<Integer>> result = zigZagLevelOrder(root);

        System.out.println(result);
    }
}
