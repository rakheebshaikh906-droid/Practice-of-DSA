package assigment;

//https://leetcode.com/problems/cousins-in-binary-tree/submissions/1924231737/
//993. Cousins in Binary Tree

public class CousinsInBinaryTree {
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
    static boolean isCousin(TreeNode root,int x,int y){
        TreeNode xx = FindNode(root,x);
        TreeNode yy = FindNode(root,y);

        return (level(root,xx,0)==level(root,yy,0) && (!isSibling(root,xx,yy)));
    }
    static TreeNode FindNode(TreeNode node,int x){
        if(node==null){
            return null;
        }
        if(node.val==x){
            return node;
        }
        //search in left side
        TreeNode n=FindNode(node.left,x);
        if(n!=null){
            return n;
        }
        //search in right side
        return FindNode(node.right,x);
    }

    static boolean isSibling(TreeNode node,TreeNode x,TreeNode y){
        if(node==null){
            return false;
        }
        return ((node.left==x && node.right==y ) || (node.left==y && node.right==x) || (isSibling(node.left,x,y)) || (isSibling(node.right,x,y)));
    }
    static int level(TreeNode node,TreeNode value,int lev){
        if(node==null){
            return -1;
        }
        if(node==value){
            return lev;
        }
        //find in left side
        int l = level(node.left,value,lev+1);
        if(l!=-1){
            return l;
        }
        return level(node.right,value,lev+1);
    }
    public static void main(String[] args) {

        // Tree:
        //          1
        //       /     \
        //      2       3
        //       \       \
        //        4       5

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(5);

        System.out.println(isCousin(root, 4, 5));  // true
    }


}
