package assigment;

//https://leetcode.com/problems/minimum-distance-between-bst-nodes/description/?envType=problem-list-v2&envId=depth-first-search
//783. Minimum Distance Between BST Nodes

import java.util.ArrayList;
import java.util.List;

public class MinimumDistanceBetweenBSTNodes {
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
    static int minDiffInBST(TreeNode root) {
        List<Integer>list=new ArrayList<>();
        inOrder(root,list);
        int min=Integer.MAX_VALUE;
        for(int i=1;i<list.size();i++){
            min=Math.min(min, list.get(i)- list.get(i-1));
        }
        return min;

    }
    static void inOrder(TreeNode node, List<Integer> result){
        if(node==null){
            return;
        }
        inOrder(node.left,result);
        result.add(node.val);
        inOrder(node.right,result);
    }
    public static void main(String[] args) {

    /*
            4
           / \
          2   6
         / \
        1   3

    Inorder = 1 2 3 4 6
    Minimum difference = 1
    */

        TreeNode root = new TreeNode(4,
                new TreeNode(2,
                        new TreeNode(1),
                        new TreeNode(3)
                ),
                new TreeNode(6)
        );

        int result = minDiffInBST(root);

        System.out.println("Minimum Distance Between BST Nodes: " + result);
    }
}
