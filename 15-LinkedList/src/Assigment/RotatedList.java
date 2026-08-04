package Assigment;

public class RotatedList {
    static public Node head;
    static public Node tail;
    static public int size;
    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
    // ---------- INSERT AT LAST ----------
    public void insertLast(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }
    // ---------- DISPLAY ----------
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    static void main(String[] args) {
        RotatedList list = new RotatedList();

        //head={1,2,3,4,5}  k=0
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);

        System.out.print("Before rotated : ");
        list.display();

        list.head=rotateRight(head,2);

        System.out.print("After rotated: ");
        list.display();
    }
    static Node rotateRight(Node head, int k) {
        if(head==null ||  k==0 || head.next==null){
            return head;
        }
        //find the length of the list
        Node node = head;
        int length = 0;
        while (node != null) {
            node = node.next;
            length+=1;
        }
        //find the actual number of rotation needed
        k = k%length;
        if(k==0){
            return head;
        }

        //find the (length-k)th node

        Node current=head;
        for(int i=0;i<length-k-1;i++){
            current=current.next;
        }

        // Find tail
        Node tail = current.next;
        while (tail.next != null) {
            tail = tail.next;
        }
        //perform the rotation
        Node newHead=current.next;
        current.next=null;
        tail.next=head;

        return newHead;
    }
}
