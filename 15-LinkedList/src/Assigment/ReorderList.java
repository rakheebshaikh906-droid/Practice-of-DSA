package Assigment;

//https://leetcode.com/problems/reorder-list/description/
//143. Reorder List
public class ReorderList {

    static Node head;
    static Node tail;

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    // ---------- INSERT ----------
    public void insertLast(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
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

    public static void main(String[] args) {
        ReorderList list = new ReorderList();

        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);

        list.display();
        reOrder(head);
        list.display(); // 1 -> 5 -> 2 -> 4 -> 3 -> END
    }

    // ---------- REORDER ----------
    static void reOrder(Node head) {
        if (head == null || head.next == null) return;

        Node mid = middle(head);

        Node hs = reverseList(mid.next);
        mid.next = null;

        Node hf = head;

        while (hs != null) {
            Node hfNext = hf.next;
            Node hsNext = hs.next;

            hf.next = hs;
            hs.next = hfNext;

            hf = hfNext;
            hs = hsNext;
        }
    }

    // ---------- MIDDLE ----------
    static Node middle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // ---------- REVERSE ----------
    static Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
