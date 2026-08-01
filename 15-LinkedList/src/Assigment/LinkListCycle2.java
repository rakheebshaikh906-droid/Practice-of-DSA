package Assigment;

//https://leetcode.com/problems/linked-list-cycle-ii/
//142. Linked List Cycle II
public class LinkListCycle2 {
    // Definition for singly-linked list.
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

    static void main(String[] args) {
        // test
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2; // cycle starts at node2

        ListNode start = detectCycle(node1);
        System.out.println(start.val); // 2
    }
    static int lengthCycle( ListNode head) {
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

    static ListNode detectCycle(ListNode head) {
        int length=0;
        ListNode fast=head;
        ListNode slow=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                length=lengthCycle(slow);
                break;
            }
        }
        // find the start node
        if (length == 0) {
            return null;
        }

        ListNode f = head;
        ListNode s = head;

        while (length > 0) {
            s = s.next;
            length--;
        }

        // keep moving both forward and they will meet at cycle start
        while (f != s) {
            f = f.next;
            s = s.next;
        }
        return s;
    }
}
