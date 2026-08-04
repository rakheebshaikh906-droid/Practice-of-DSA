package Assigment;

//https://leetcode.com/problems/sort-list/description/
//148. Sort List
public class SortList {
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
        //head={4,3,2,1};
        // Creating linked list: 4 -> 3 -> 2 -> 1
        ListNode head = new ListNode(4);
        head.next = new ListNode(3);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        System.out.print("Before Sorting: ");
        display(head);

        head = sortList(head);

        System.out.print("After Sorting: ");
        display(head);
    }
    static ListNode sortList(ListNode head){
        if(head==null || head.next==null){
            return head;
        }

        ListNode mid=getMid(head);
        ListNode rightHead = mid.next;
        mid.next = null;   // 🔥 list split
        ListNode left=sortList(head);
        ListNode right=sortList(rightHead);

        return merge(left,right);
    }
    static ListNode merge(ListNode list1,ListNode list2){
        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        tail.next = (list1 != null) ? list1 : list2;
        return dummyHead.next;
    }
    static ListNode getMid(ListNode head){
        ListNode fast=head.next;
        ListNode slow=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    static void display(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("END");
    }
}
