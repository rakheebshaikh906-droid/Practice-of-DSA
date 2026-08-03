package Assigment;

//https://leetcode.com/problems/remove-duplicates-from-sorted-list/
//83. Remove Duplicates from Sorted List

import code.CLL;
public class RemoveDuplicates {
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

        // Creating linked list: 1 -> 1 -> 2
        ListNode head = new ListNode(1,
                new ListNode(1,
                        new ListNode(2)));

        head = deleteDuplicates(head);

        // Print result
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
         System.out.println("END");
    }

    //main leetcode method
    static ListNode deleteDuplicates(ListNode head) {

        if (head == null) {
            return head;
        }

        ListNode node = head;

        while (node.next != null) {
            if (node.val == node.next.val) {
                node.next = node.next.next; // skip duplicate
            } else {
                node = node.next;
            }
        }
        return head;
    }
}

