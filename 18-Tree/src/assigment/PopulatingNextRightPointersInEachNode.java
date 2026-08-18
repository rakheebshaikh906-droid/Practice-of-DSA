package assigment;

//https://leetcode.com/problems/populating-next-right-pointers-in-each-node/submissions/1923180979/
//116. Populating Next Right Pointers in Each Node

public class PopulatingNextRightPointersInEachNode {
    static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node left, Node right, Node next) {
            this.val = val;
            this.left = left;
            this.right = right;
            this.next = next;
        }
    }
    static Node connect(Node root){
        if(root==null){
            return null;
        }
        Node leftmost=root;
        while(leftmost.left!=null){
            Node current=leftmost;
            while(current!=null){
                current.left.next=current.right;
                if(current.next!=null){
                    current.right.next=current.next.left;
                }
                current=current.next;
            }
            leftmost=leftmost.left;
        }
        return root;
    }
    static void main(String[] args) {
        // Perfect Binary Tree:
        //        1
        //      /   \
        //     2     3
        //    / \   / \
        //   4   5 6   7

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        connect(root);

        // Printing next pointers of level 2
        System.out.println(root.left.val + " -> " + root.left.next.val);
        System.out.println(root.left.left.val + " -> " + root.left.left.next.val);
        System.out.println(root.left.right.val + " -> " + root.left.right.next.val);
    }
}
