package Assigment;

//https://leetcode.com/problems/remove-nodes-from-linked-list/description/?envType=problem-list-v2&envId=recursion
//2487. Remove Nodes From Linked List

public class RemoveNodesFromLinkedList {

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode removeNodes(ListNode head) {

        head = reverse(head);

        int max = head.val;
        ListNode curr = head;

        while (curr != null && curr.next != null) {

            if (curr.next.val < max) {
                curr.next = curr.next.next;
            } else {
                max = curr.next.val;
                curr = curr.next;
            }
        }

        return reverse(head);
    }

    public static ListNode reverse(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {

            ListNode next = curr.next;

            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public static void printList(ListNode head) {

        ListNode curr = head;

        while (curr != null) {
            System.out.print(curr.val);

            if (curr.next != null) {
                System.out.print(" -> ");
            }

            curr = curr.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(5);
        head.next = new ListNode(2);
        head.next.next = new ListNode(13);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(8);

        System.out.println("Original List:");
        printList(head);

        head = removeNodes(head);

        System.out.println("After Removing Nodes:");
        printList(head);
    }
}