package assigment;

//https://leetcode.com/problems/binary-tree-inorder-traversal/description/?envType=problem-list-v2&envId=depth-first-search
//94. Binary Tree Inorder Traversal

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {

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
    static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>result=new ArrayList<>();
        helper(root,result);
        return result;
    }
    static void helper(TreeNode node,List<Integer>result){
        if(node==null){
            return;
        }
        helper(node.left,result);
        result.add(node.val);
        helper(node.right,result);
    }
    public static void main(String[] args) {

        /*
                1
                 \
                  2
                 /
                3

        Inorder = 1 3 2
        */

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> result = inorderTraversal(root);

        System.out.println("Inorder Traversal: " + result);
    }
}
