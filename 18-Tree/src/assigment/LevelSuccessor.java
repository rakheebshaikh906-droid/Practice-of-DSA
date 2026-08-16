package assigment;
//Q.level order successor of a nodes

import java.util.LinkedList;
import java.util.Queue;

public class LevelSuccessor {
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
    static TreeNode levelOrderSuccessor(TreeNode root, int key){
        if (root == null) {
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            TreeNode currentNode = queue.poll();
            if (currentNode.left != null) {
                queue.offer(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.offer(currentNode.right);
            }
            if(currentNode.val==key){
                break;
            }

        }
        return queue.peek();
    }
    static void main(String[] args) {

        // Tree create kar rahe hain:
        //          3
        //       /    \
        //      4      8
        //     /  \   /  \
        //    12  14 7    11

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left=new TreeNode(12);
        root.left.right=new TreeNode(14);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(11);

        TreeNode result = levelOrderSuccessor(root,14);

        if(result != null) {
            System.out.println(result.val);
        } else {
            System.out.println("No successor found");
        }
    }
}
