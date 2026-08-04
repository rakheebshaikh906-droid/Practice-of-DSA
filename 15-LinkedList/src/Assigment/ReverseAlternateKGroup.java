package Assigment;

public class ReverseAlternateKGroup {
    static public Node head;
    static public Node tail;
    static public int size;
    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }

        Node(int val,Node next) {
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
        ReverseAlternateKGroup list=new ReverseAlternateKGroup();

        //head={1,2,3,4,5,7}  k=3 ;
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(6);
        list.insertLast(7);
        list.insertLast(8);
        list.insertLast(9);

        System.out.print("Before reverse a node: ");
        list.display();

        list.head=reverseAlternateKGroup(head,3);

        System.out.print("After reversing k nodes:");
        list.display();
    }
    static Node reverseAlternateKGroup(Node head, int k) {
        if (k <= 1 || head == null) {
            return head;
        }

        // skip the first left-1 nodes
        Node current = head;
        Node prev = null;

        while (current != null) {
            Node last = prev;
            Node newEnd = current;

            // reverse between left and right
            Node next = current.next;
            for (int i = 0; current != null && i < k; i++) {
                current.next = prev;
                prev = current;
                current = next;
                if (next != null) {
                    next = next.next;
                }
            }

            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }

            newEnd.next = current;

            // skip the k nodes
            for (int i = 0; current != null && i < k; i++) {
                prev = current;
                current = current.next;
            }
        }
        return head;
    }
}
