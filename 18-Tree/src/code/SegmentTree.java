package code;

public class SegmentTree {
    static void main(String[] args) {
        int[]arr={3,8,7,6,-2,-8,4,9};
        SegmentTree tree = new SegmentTree(arr);

    }
    private static class Node{
        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        public Node(int startInterval,int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }
    Node root;
    public SegmentTree(int[] arr) {
        this.root=constructTree(arr,0,arr.length-1);
    }
    private Node constructTree(int[]arr,int start,int end){
        //base case
        if(start==end){
            Node leaf=new Node(start,end);
            leaf.data=arr[start];
            return leaf;
        }
        //crate a new node
        Node node = new Node(start,end);

        int mid=(start+end)/2;

        node.left=this.constructTree(arr,start,mid);
        node.right=this.constructTree(arr,mid+1,end);

        node.data=node.left.data+node.right.data;
        return node;
    }

}
