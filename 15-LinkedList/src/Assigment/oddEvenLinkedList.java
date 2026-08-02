package Assigment;

//https://leetcode.com/problems/odd-even-linked-list/description/
//328. Odd Even Linked List
public class oddEvenLinkedList {
    static public ListNode head;
    static public ListNode tail;
    static public int size;
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val,ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    // ---------- INSERT AT LAST ----------
    static ListNode insertLast(ListNode head, int val) {
        ListNode node = new ListNode(val);

        if (head == null) {
            return node;
        }
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        return head;
    }
    // ---------- DISPLAY ----------
    static void display(ListNode head){
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    static void main(String[] args) {

        // Create linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = null;
        head = insertLast(head, 1);
        head = insertLast(head, 2);
        head = insertLast(head, 3);
        head = insertLast(head, 4);
        head = insertLast(head, 5);

        System.out.print("Original List: ");
        display(head);

        // Apply odd-even logic
        head = oddEvenList(head);

        System.out.print("Odd Even List: ");
        display(head);
    }
    static ListNode oddEvenList(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode prev=head;
        ListNode curr=head.next;
        ListNode head2=curr;

        while(curr!=null && curr.next!=null){

            //linked odd nodes
            prev.next=curr.next;
            prev=prev.next;

            //linked even nodes
            curr.next=prev.next;
            curr=curr.next;

            //link both odd and even
        }
        prev.next=head2;
        return head;
    }
}
