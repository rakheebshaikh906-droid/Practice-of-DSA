package assigment;

//https://leetcode.com/problems/binary-tree-right-side-view/description/
//199. Binary Tree Right Side View

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {
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
    static List<Integer> rightSideView(TreeNode root) {
        List<Integer>result=new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelSize= queue.size();
            for(int i=0;i<levelSize;i++){
                TreeNode currentNode=queue.poll();
                if(i==levelSize-1){
                    result.add(currentNode.val);
                }
                if(currentNode.left!=null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right!=null){
                    queue.offer(currentNode.right);
                }
            }
        }
        return result;
    }

    static void main(String[] args) {
        // Tree create kar rahe hain:
        //        3
        //       / \
        //      9  20
        //         /  \
        //        15   7

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<Integer> result = rightSideView(root);

        System.out.println(result);
    }

}
