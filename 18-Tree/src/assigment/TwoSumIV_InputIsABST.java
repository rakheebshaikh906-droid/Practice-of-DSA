package assigment;

//https://leetcode.com/problems/two-sum-iv-input-is-a-bst/description/
//653. Two Sum IV - Input is a BST

import java.util.ArrayList;
import java.util.List;

public class TwoSumIV_InputIsABST {
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
    static boolean findTarget(TreeNode root, int k) {
        List<Integer>list=new ArrayList<>();
        inOrder(root,list);
        int start=0;
        int end=list.size()-1;

        while(start<end){
            int sum= list.get(start)+list.get(end);
            if(sum==k){
                return true;
            } else if (sum<k) {
                start++;
            }else{
                end--;
            }
        }
        return false;
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
                5
               / \
              3   6
             / \   \
            2   4   7

        k = 9 → true (2 + 7)
        */

        TreeNode root = new TreeNode(5,
                new TreeNode(3,
                        new TreeNode(2),
                        new TreeNode(4)
                ),
                new TreeNode(6,
                        null,
                        new TreeNode(7)
                )
        );

        int k = 9;

        boolean result = findTarget(root, k);

        System.out.println("Two Sum Exists: " + result);
    }
}
