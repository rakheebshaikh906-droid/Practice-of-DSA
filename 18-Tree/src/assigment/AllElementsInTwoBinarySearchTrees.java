package assigment;

//https://leetcode.com/problems/all-elements-in-two-binary-search-trees/description/?envType=problem-list-v2&envId=depth-first-search
//1305. All Elements in Two Binary Search Trees

import java.util.*;

public class AllElementsInTwoBinarySearchTrees {
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
    static List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer>list1=new ArrayList<>();

        inOrder(root1,list1);
        inOrder(root2,list1);

        Collections.sort(list1);
        return list1;
    }

    static void inOrder(TreeNode node,List<Integer>result){
        if(node == null){
            return;
        }
        inOrder(node.left,result);
        result.add(node.val);
        inOrder(node.right,result);
    }
    public static void main(String[] args) {

        /*
            Tree 1
                2
               / \
              1   4

            Tree 2
                1
               / \
              0   3
        */

        TreeNode root1 = new TreeNode(2,
                new TreeNode(1),
                new TreeNode(4)
        );

        TreeNode root2 = new TreeNode(1,
                new TreeNode(0),
                new TreeNode(3)
        );

        List<Integer> result = getAllElements(root1, root2);

        System.out.println("All Elements: " + result);
    }
}
