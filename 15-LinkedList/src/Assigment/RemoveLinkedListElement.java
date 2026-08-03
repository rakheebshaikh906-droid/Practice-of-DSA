package Assigment;

//https://leetcode.com/problems/remove-linked-list-elements/description/?envType=problem-list-v2&envId=linked-list
//203. Remove Linked List Elements
public class RemoveLinkedListElement {
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
        ListNode head = null;

        // Insert elements
        head = insertLast(head, 1);
        head = insertLast(head, 2);
        head = insertLast(head, 6);
        head = insertLast(head, 3);
        head = insertLast(head, 4);
        head = insertLast(head, 5);
        head = insertLast(head, 6);

        System.out.print("Original Linked List:");
        display(head);

        int val = 6;
        head = removeElement(head, val);

        System.out.print("After removing element given value " + ":");
        display(head);
    }
    static ListNode removeElement (ListNode head,int val){

        if(head==null || head.next==null){
            return head;
        }

        ListNode dummy=new ListNode(0);
        dummy.next=head;

        ListNode prev=dummy;
        ListNode curr=head;

        while(curr!=null){
            if(curr.val==val){
                prev.next=curr.next;
                curr=curr.next;
            }else{
                prev=curr;
                curr=curr.next;
            }
        }
        return dummy.next;
    }
}
