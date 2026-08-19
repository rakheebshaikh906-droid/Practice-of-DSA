package assigment;

//https://leetcode.com/problems/serialize-and-deserialize-binary-tree/description/
//297. Serialize and Deserialize Binary Tree

import java.util.*;

public class SerializeAndDeserializeBinaryTree {
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
    // Encodes a tree to a single string.
    static String serialize(TreeNode root) {
        List<String> list = new ArrayList<>();
        helper(root, list);
        return String.join(",", list);  // Convert list to single string
    }

    private static void helper(TreeNode node, List<String> list) {
        if (node == null) {
            list.add("null");
            return;
        }

        list.add(String.valueOf(node.val));
        helper(node.left, list);
        helper(node.right, list);
    }

    // Decodes your encoded data to tree.
    static TreeNode deserialize(String data) {

        String[] arr = data.split(",");
        List<String> list = new ArrayList<>(Arrays.asList(arr));

        Collections.reverse(list);
        return buildTree(list);
    }

    private static TreeNode buildTree(List<String> list) {

        String val = list.remove(list.size() - 1);

        if (val.equals("null")) {
            return null;
        }

        TreeNode node = new TreeNode(Integer.parseInt(val));

        node.left = buildTree(list);
        node.right = buildTree(list);

        return node;
    }
    // Inorder print to verify tree
    static void printInorder(TreeNode root) {
        if (root == null) return;
        printInorder(root.left);
        System.out.print(root.val + " ");
        printInorder(root.right);
    }

    public static void main(String[] args) {

        /*
                1
               / \
              2   3
                 / \
                4   5
        */

        TreeNode root = new TreeNode(1,
                new TreeNode(2),
                new TreeNode(3,
                        new TreeNode(4),
                        new TreeNode(5)
                )
        );

        String serialized = serialize(root);
        System.out.println("Serialized: " + serialized);

        TreeNode newRoot = deserialize(serialized);

        System.out.print("Inorder after Deserialize: ");
        printInorder(newRoot);
    }
}
