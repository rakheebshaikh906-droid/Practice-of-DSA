package Assigment;

//https://leetcode.com/problems/linked-list-cycle/description/
//141. Linked List Cycle
public class LinkedListCycle {
    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    static void main(String[] args) {
        // optional testing
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);

        node1.next = node2;
        node2.next = node3;
        node3.next = node2; // creates a cycle

        System.out.println(hasCycle(node1)); // true
        System.out.println(lengthCycle(node1));
    }
    static boolean hasCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }

    //Return the length of a linked list cycle
    static int lengthCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                //calculate the length of a linked list cycle
                ListNode temp=slow;
                int length=0;
                do {
                    temp=temp.next;
                    length++;
                }while(temp!=slow);
                return length;
            }
        }
        return 0;
    }
}
