package assigment;

//https://leetcode.com/problems/average-of-levels-in-binary-tree/description/
//637. Average of Levels in Binary Tree

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevelsInBinaryTree {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val,TreeNode left,TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    static List<Double>AverageLevel(TreeNode root){
        List<Double>result=new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode>queue=new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelSize= queue.size();
            double averageLevel=0;
            for(int i=0;i<levelSize;i++){
                TreeNode currentNode=queue.poll();
                averageLevel+=currentNode.val;
                if(currentNode.left!=null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right!=null){
                    queue.offer(currentNode.right);
                }
            }
            averageLevel=averageLevel/levelSize;
            result.add(averageLevel);
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

        List<Double> result = AverageLevel(root);

        System.out.println(result);
    }

}
