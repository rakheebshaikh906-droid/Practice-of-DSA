package assigment;

//https://leetcode.com/problems/n-ary-tree-postorder-traversal/description/?envType=problem-list-v2&envId=depth-first-search
//590. N-ary Tree Postorder Traversal

import java.util.ArrayList;
import java.util.List;

public class NAryTreePostorderTraversal {

    static class Node {
        int val;
        List<Node> children;

        Node() {}

        Node(int val) {
            this.val = val;
            children = new ArrayList<>();
        }

        Node(int val, List<Node> children) {
            this.val = val;
            this.children = children;
        }
    }

    static List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<>();
        helper(root, result);
        return result;
    }

    static void helper(Node node, List<Integer> result) {

        if (node == null) {
            return;
        }

        if (node.children != null) {
            for (Node child : node.children) {
                helper(child, result);
            }
        }

        result.add(node.val);
    }

    public static void main(String[] args) {

        /*
                1
              / | \
             3  2  4
            / \
           5   6

        Postorder = 5 6 3 2 4 1
        */

        Node root = new Node(1);

        Node node3 = new Node(3);
        Node node2 = new Node(2);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);

        root.children.add(node3);
        root.children.add(node2);
        root.children.add(node4);

        node3.children.add(node5);
        node3.children.add(node6);

        List<Integer> result = postorder(root);

        System.out.println("Postorder Traversal: " + result);
    }
}